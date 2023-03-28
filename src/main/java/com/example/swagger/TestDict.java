package com.example.swagger;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @Author: 高建伟
* @Date: 2022/11/22
* @Description:
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("测试字典类")
public class TestDict {

    @ApiModelProperty("主键")
    private String id;
    @ApiModelProperty("字典类型")
    private String dictType;
    @ApiModelProperty("字典值")
    private String dictValue;
    @ApiModelProperty("字典key")
    private String dictKey;
    @ApiModelProperty("备注")
    private String remark;
}
