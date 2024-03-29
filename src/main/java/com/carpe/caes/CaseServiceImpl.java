package com.carpe.caes;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class CaseServiceImpl implements CaseService {

	@Inject
	private CaseDAO dao;

	@Override
	public List<Map> selectCaseList(Map<String, Object> paramMap) throws Exception {
		return dao.selectCaseList(paramMap);
	}

	@Override
	public Map selectCaseListCount(Map<String, Object> paramMap) throws Exception {
		return dao.selectCaseListCount(paramMap);
	}

	
	@Override
	public int insertCase(Map<String, Object> paramMap) throws Exception {
		return dao.insertCase(paramMap);
	}

	@Override
	public int deleteCaseList(Map<String, Object> paramMap) throws Exception {
		return dao.deleteCaseList(paramMap);
	}

	@Override
	public Map selectCaseUserAuthCount(Map<String, Object> paramMap) throws Exception {
		return dao.selectCaseUserAuthCount(paramMap);
	}

	@Override
	public int deleteCaseUserAuth(Map<String, Object> paramMap) throws Exception {
		return dao.deleteCaseUserAuth(paramMap);
	}
}