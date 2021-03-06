package cn.iocoder.mall.order.biz.convert;

import cn.iocoder.mall.order.api.bo.OrderInfoBO.LogisticsDetail;
import cn.iocoder.mall.order.biz.dataobject.OrderLogisticsDetailDO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-04T13:34:29+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_161 (Oracle Corporation)"
)
public class OrderLogisticsDetailConvertImpl implements OrderLogisticsDetailConvert {

    @Override
    public LogisticsDetail convertLogisticsDetail(OrderLogisticsDetailDO orderLogisticsDetailDO) {
        if ( orderLogisticsDetailDO == null ) {
            return null;
        }

        LogisticsDetail logisticsDetail = new LogisticsDetail();

        logisticsDetail.setId( orderLogisticsDetailDO.getId() );
        logisticsDetail.setOrderLogisticsId( orderLogisticsDetailDO.getOrderLogisticsId() );
        logisticsDetail.setLogisticsTime( orderLogisticsDetailDO.getLogisticsTime() );
        logisticsDetail.setLogisticsInformation( orderLogisticsDetailDO.getLogisticsInformation() );

        return logisticsDetail;
    }
}
