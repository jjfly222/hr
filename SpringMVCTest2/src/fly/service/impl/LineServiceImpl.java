package fly.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fly.dao.LineDao;
import fly.entity.Line;
import fly.service.LineService;
@Service
public class LineServiceImpl implements LineService {
	@Autowired
	private LineDao lineDao;
	@Override
	public void addLine(Line line) {
		lineDao.addLine(line);
	}

}
