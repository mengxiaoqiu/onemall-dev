package cn.iocoder.mall.admin.application.convert;

import cn.iocoder.mall.admin.api.bo.datadict.DataDictBO;
import cn.iocoder.mall.admin.application.vo.datadict.DataDictEnumVO.Value;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-04T13:26:43+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_161 (Oracle Corporation)"
)
public class DataDictConvertImpl implements DataDictConvert {

    @Override
    public List<Value> convert2(List<DataDictBO> dataDictBOs) {
        if ( dataDictBOs == null ) {
            return null;
        }

        List<Value> list = new ArrayList<Value>( dataDictBOs.size() );
        for ( DataDictBO dataDictBO : dataDictBOs ) {
            list.add( dataDictBOToValue( dataDictBO ) );
        }

        return list;
    }

    protected Value dataDictBOToValue(DataDictBO dataDictBO) {
        if ( dataDictBO == null ) {
            return null;
        }

        Value value = new Value();

        value.setValue( dataDictBO.getValue() );
        value.setDisplayName( dataDictBO.getDisplayName() );

        return value;
    }
}
