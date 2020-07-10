package com.pumsac.pms.dao;

import com.pumsac.command.SearchCriteria;
import com.pumsac.vo.ProBoardMasterVO;
import com.pumsac.vo.ProBoardVO;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Repository("pmsPdsDao")
public class PmsPdsDaoImpl implements PmsPdsDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public int selectNextProBoardSeq() throws SQLException {
		return sqlSession.selectOne("pms-pds-mapper.getNextProBoardSeq");
	}

	@Override
	public void insertPds(ProBoardVO board) throws SQLException {
		sqlSession.update("pms-pds-mapper.registPds", board);
	}

	@Override
	public List<ProBoardVO> selectPdsList(Map<String, Object> map) throws SQLException {
		SearchCriteria cri = (SearchCriteria) map.get("cri");
		int offset = cri.getPageStartRowNum();
		int limit = cri.getPerPageNum();
		RowBounds rowBounds = new RowBounds(offset, limit);
		return sqlSession.selectList("pms-pds-mapper.selectPdsList", map, rowBounds);
	}

	@Override
	public void updatePdsViewCnt(int no) throws SQLException {
		sqlSession.update("pms-pds-mapper.updatePdsViewCnt", no);
	}

	@Override
	public ProBoardVO selectPdsDetail(int no) throws SQLException {
		return sqlSession.selectOne("pms-pds-mapper.selectPdsDetail", no);
	}

	@Override
	public void updatePds(ProBoardVO board) throws SQLException {
		sqlSession.update("pms-pds-mapper.updatePds", board);
	}

	@Override
	public void removePds(int no) throws SQLException {
		sqlSession.update("pms-pds-mapper.removePds", no);
	}

	//해당 프로젝트의 게시판들을 가져오는 dao
	@Override
	public List<ProBoardMasterVO> selectBoardMasterList(int projectId) throws SQLException {	
		List<ProBoardMasterVO> list = null;
		list = sqlSession.selectList("pms-pds-mapper.selectBoardMasterList", projectId);
		return list;
	}

	@Override
	public int selectPdsTotalCount(String boardname) throws SQLException {
		int count = 0;
		count = sqlSession.selectOne("pms-pds-mapper.selectPdsTotalCount",boardname);
		return count;
	}
}
