package cn.blooming.bep.crawler.model.mapper;

import cn.blooming.bep.crawler.model.entity.FundStatistics;
import cn.blooming.bep.crawler.model.entity.FundStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import cn.blooming.bep.crawler.model.entity.FundStatisticsKey;

public interface FundStatisticsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fund_statistics
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	long countByExample(FundStatisticsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fund_statistics
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	int deleteByExample(FundStatisticsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fund_statistics
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	int deleteByPrimaryKey(FundStatisticsKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fund_statistics
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	int insert(FundStatistics record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fund_statistics
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	int insertSelective(FundStatistics record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fund_statistics
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	List<FundStatistics> selectByExample(FundStatisticsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fund_statistics
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	FundStatistics selectByPrimaryKey(FundStatisticsKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fund_statistics
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	int updateByExampleSelective(@Param("record") FundStatistics record,
			@Param("example") FundStatisticsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fund_statistics
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	int updateByExample(@Param("record") FundStatistics record, @Param("example") FundStatisticsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fund_statistics
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	int updateByPrimaryKeySelective(FundStatistics record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fund_statistics
	 * @mbg.generated  Thu Jan 10 14:50:37 CST 2019
	 */
	int updateByPrimaryKey(FundStatistics record);
}