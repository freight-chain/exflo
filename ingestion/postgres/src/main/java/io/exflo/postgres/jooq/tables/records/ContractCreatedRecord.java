/*
 * This file is generated by jOOQ.
 */
package io.exflo.postgres.jooq.tables.records;


import io.exflo.postgres.jooq.enums.ContractCapability;
import io.exflo.postgres.jooq.enums.ContractType;
import io.exflo.postgres.jooq.tables.ContractCreated;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record15;
import org.jooq.Record2;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ContractCreatedRecord extends UpdatableRecordImpl<ContractCreatedRecord> implements Record15<String, String, String, ContractType, ContractCapability[], String, String, Short, BigDecimal, BigDecimal, BigDecimal, String, Long, String, Timestamp> {

    private static final long serialVersionUID = -436791992;

    /**
     * Setter for <code>public.contract_created.address</code>.
     */
    public ContractCreatedRecord setAddress(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_created.address</code>.
     */
    public String getAddress() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.contract_created.creator</code>.
     */
    public ContractCreatedRecord setCreator(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_created.creator</code>.
     */
    public String getCreator() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.contract_created.code</code>.
     */
    public ContractCreatedRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_created.code</code>.
     */
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.contract_created.type</code>.
     */
    public ContractCreatedRecord setType(ContractType value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_created.type</code>.
     */
    public ContractType getType() {
        return (ContractType) get(3);
    }

    /**
     * Setter for <code>public.contract_created.capabilities</code>.
     */
    public ContractCreatedRecord setCapabilities(ContractCapability... value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_created.capabilities</code>.
     */
    public ContractCapability[] getCapabilities() {
        return (ContractCapability[]) get(4);
    }

    /**
     * Setter for <code>public.contract_created.name</code>.
     */
    public ContractCreatedRecord setName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_created.name</code>.
     */
    public String getName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.contract_created.symbol</code>.
     */
    public ContractCreatedRecord setSymbol(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_created.symbol</code>.
     */
    public String getSymbol() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.contract_created.decimals</code>.
     */
    public ContractCreatedRecord setDecimals(Short value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_created.decimals</code>.
     */
    public Short getDecimals() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>public.contract_created.total_supply</code>.
     */
    public ContractCreatedRecord setTotalSupply(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_created.total_supply</code>.
     */
    public BigDecimal getTotalSupply() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>public.contract_created.granularity</code>.
     */
    public ContractCreatedRecord setGranularity(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_created.granularity</code>.
     */
    public BigDecimal getGranularity() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>public.contract_created.cap</code>.
     */
    public ContractCreatedRecord setCap(BigDecimal value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_created.cap</code>.
     */
    public BigDecimal getCap() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>public.contract_created.block_hash</code>.
     */
    public ContractCreatedRecord setBlockHash(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_created.block_hash</code>.
     */
    public String getBlockHash() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.contract_created.block_number</code>.
     */
    public ContractCreatedRecord setBlockNumber(Long value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_created.block_number</code>.
     */
    public Long getBlockNumber() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>public.contract_created.transaction_hash</code>.
     */
    public ContractCreatedRecord setTransactionHash(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_created.transaction_hash</code>.
     */
    public String getTransactionHash() {
        return (String) get(13);
    }

    /**
     * Setter for <code>public.contract_created.timestamp</code>.
     */
    public ContractCreatedRecord setTimestamp(Timestamp value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_created.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<String, String, String, ContractType, ContractCapability[], String, String, Short, BigDecimal, BigDecimal, BigDecimal, String, Long, String, Timestamp> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<String, String, String, ContractType, ContractCapability[], String, String, Short, BigDecimal, BigDecimal, BigDecimal, String, Long, String, Timestamp> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ContractCreated.CONTRACT_CREATED.ADDRESS;
    }

    @Override
    public Field<String> field2() {
        return ContractCreated.CONTRACT_CREATED.CREATOR;
    }

    @Override
    public Field<String> field3() {
        return ContractCreated.CONTRACT_CREATED.CODE;
    }

    @Override
    public Field<ContractType> field4() {
        return ContractCreated.CONTRACT_CREATED.TYPE;
    }

    @Override
    public Field<ContractCapability[]> field5() {
        return ContractCreated.CONTRACT_CREATED.CAPABILITIES;
    }

    @Override
    public Field<String> field6() {
        return ContractCreated.CONTRACT_CREATED.NAME;
    }

    @Override
    public Field<String> field7() {
        return ContractCreated.CONTRACT_CREATED.SYMBOL;
    }

    @Override
    public Field<Short> field8() {
        return ContractCreated.CONTRACT_CREATED.DECIMALS;
    }

    @Override
    public Field<BigDecimal> field9() {
        return ContractCreated.CONTRACT_CREATED.TOTAL_SUPPLY;
    }

    @Override
    public Field<BigDecimal> field10() {
        return ContractCreated.CONTRACT_CREATED.GRANULARITY;
    }

    @Override
    public Field<BigDecimal> field11() {
        return ContractCreated.CONTRACT_CREATED.CAP;
    }

    @Override
    public Field<String> field12() {
        return ContractCreated.CONTRACT_CREATED.BLOCK_HASH;
    }

    @Override
    public Field<Long> field13() {
        return ContractCreated.CONTRACT_CREATED.BLOCK_NUMBER;
    }

    @Override
    public Field<String> field14() {
        return ContractCreated.CONTRACT_CREATED.TRANSACTION_HASH;
    }

    @Override
    public Field<Timestamp> field15() {
        return ContractCreated.CONTRACT_CREATED.TIMESTAMP;
    }

    @Override
    public String component1() {
        return getAddress();
    }

    @Override
    public String component2() {
        return getCreator();
    }

    @Override
    public String component3() {
        return getCode();
    }

    @Override
    public ContractType component4() {
        return getType();
    }

    @Override
    public ContractCapability[] component5() {
        return getCapabilities();
    }

    @Override
    public String component6() {
        return getName();
    }

    @Override
    public String component7() {
        return getSymbol();
    }

    @Override
    public Short component8() {
        return getDecimals();
    }

    @Override
    public BigDecimal component9() {
        return getTotalSupply();
    }

    @Override
    public BigDecimal component10() {
        return getGranularity();
    }

    @Override
    public BigDecimal component11() {
        return getCap();
    }

    @Override
    public String component12() {
        return getBlockHash();
    }

    @Override
    public Long component13() {
        return getBlockNumber();
    }

    @Override
    public String component14() {
        return getTransactionHash();
    }

    @Override
    public Timestamp component15() {
        return getTimestamp();
    }

    @Override
    public String value1() {
        return getAddress();
    }

    @Override
    public String value2() {
        return getCreator();
    }

    @Override
    public String value3() {
        return getCode();
    }

    @Override
    public ContractType value4() {
        return getType();
    }

    @Override
    public ContractCapability[] value5() {
        return getCapabilities();
    }

    @Override
    public String value6() {
        return getName();
    }

    @Override
    public String value7() {
        return getSymbol();
    }

    @Override
    public Short value8() {
        return getDecimals();
    }

    @Override
    public BigDecimal value9() {
        return getTotalSupply();
    }

    @Override
    public BigDecimal value10() {
        return getGranularity();
    }

    @Override
    public BigDecimal value11() {
        return getCap();
    }

    @Override
    public String value12() {
        return getBlockHash();
    }

    @Override
    public Long value13() {
        return getBlockNumber();
    }

    @Override
    public String value14() {
        return getTransactionHash();
    }

    @Override
    public Timestamp value15() {
        return getTimestamp();
    }

    @Override
    public ContractCreatedRecord value1(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public ContractCreatedRecord value2(String value) {
        setCreator(value);
        return this;
    }

    @Override
    public ContractCreatedRecord value3(String value) {
        setCode(value);
        return this;
    }

    @Override
    public ContractCreatedRecord value4(ContractType value) {
        setType(value);
        return this;
    }

    @Override
    public ContractCreatedRecord value5(ContractCapability... value) {
        setCapabilities(value);
        return this;
    }

    @Override
    public ContractCreatedRecord value6(String value) {
        setName(value);
        return this;
    }

    @Override
    public ContractCreatedRecord value7(String value) {
        setSymbol(value);
        return this;
    }

    @Override
    public ContractCreatedRecord value8(Short value) {
        setDecimals(value);
        return this;
    }

    @Override
    public ContractCreatedRecord value9(BigDecimal value) {
        setTotalSupply(value);
        return this;
    }

    @Override
    public ContractCreatedRecord value10(BigDecimal value) {
        setGranularity(value);
        return this;
    }

    @Override
    public ContractCreatedRecord value11(BigDecimal value) {
        setCap(value);
        return this;
    }

    @Override
    public ContractCreatedRecord value12(String value) {
        setBlockHash(value);
        return this;
    }

    @Override
    public ContractCreatedRecord value13(Long value) {
        setBlockNumber(value);
        return this;
    }

    @Override
    public ContractCreatedRecord value14(String value) {
        setTransactionHash(value);
        return this;
    }

    @Override
    public ContractCreatedRecord value15(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public ContractCreatedRecord values(String value1, String value2, String value3, ContractType value4, ContractCapability[] value5, String value6, String value7, Short value8, BigDecimal value9, BigDecimal value10, BigDecimal value11, String value12, Long value13, String value14, Timestamp value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ContractCreatedRecord
     */
    public ContractCreatedRecord() {
        super(ContractCreated.CONTRACT_CREATED);
    }

    /**
     * Create a detached, initialised ContractCreatedRecord
     */
    public ContractCreatedRecord(String address, String creator, String code, ContractType type, ContractCapability[] capabilities, String name, String symbol, Short decimals, BigDecimal totalSupply, BigDecimal granularity, BigDecimal cap, String blockHash, Long blockNumber, String transactionHash, Timestamp timestamp) {
        super(ContractCreated.CONTRACT_CREATED);

        set(0, address);
        set(1, creator);
        set(2, code);
        set(3, type);
        set(4, capabilities);
        set(5, name);
        set(6, symbol);
        set(7, decimals);
        set(8, totalSupply);
        set(9, granularity);
        set(10, cap);
        set(11, blockHash);
        set(12, blockNumber);
        set(13, transactionHash);
        set(14, timestamp);
    }
}
