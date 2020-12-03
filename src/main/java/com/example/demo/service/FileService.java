package com.example.demo.service;

import com.example.demo.entity.SysFile;
import com.example.demo.vo.req.FilePageReqVO;
import com.example.demo.vo.resp.PageVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

public interface FileService {
    String upload(MultipartFile file, String userId, Integer type);

    void download(String fileId, HttpServletResponse response);

    int deleteByFileUrl(String fileUrl);

    PageVO<SysFile> pageInfo(FilePageReqVO vo, String userId);
}