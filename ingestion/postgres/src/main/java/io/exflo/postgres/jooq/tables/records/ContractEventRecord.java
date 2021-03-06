/*
 * This file is generated by jOOQ.
 */
package io.exflo.postgres.jooq.tables.records;


import io.exflo.postgres.jooq.enums.ContractEventType;
import io.exflo.postgres.jooq.tables.ContractEvent;

import java.math.BigDecimal;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.TableRecordImpl;


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
public class ContractEventRecord extends TableRecordImpl<ContractEventRecord> implements Record22<Long, String, String, String, ContractEventType, String, String, String, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal[], BigDecimal[], Boolean, byte[], byte[], String> {

    private static final long serialVersionUID = -852438330;

    /**
     * Setter for <code>public.contract_event.block_number</code>.
     */
    public ContractEventRecord setBlockNumber(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.block_number</code>.
     */
    public Long getBlockNumber() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.contract_event.block_hash</code>.
     */
    public ContractEventRecord setBlockHash(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.block_hash</code>.
     */
    public String getBlockHash() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.contract_event.transaction_hash</code>.
     */
    public ContractEventRecord setTransactionHash(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.transaction_hash</code>.
     */
    public String getTransactionHash() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.contract_event.contract_address</code>.
     */
    public ContractEventRecord setContractAddress(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.contract_address</code>.
     */
    public String getContractAddress() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.contract_event.type</code>.
     */
    public ContractEventRecord setType(ContractEventType value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.type</code>.
     */
    public ContractEventType getType() {
        return (ContractEventType) get(4);
    }

    /**
     * Setter for <code>public.contract_event.owner_address</code>.
     */
    public ContractEventRecord setOwnerAddress(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.owner_address</code>.
     */
    public String getOwnerAddress() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.contract_event.spender_address</code>.
     */
    public ContractEventRecord setSpenderAddress(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.spender_address</code>.
     */
    public String getSpenderAddress() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.contract_event.operator_address</code>.
     */
    public ContractEventRecord setOperatorAddress(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.operator_address</code>.
     */
    public String getOperatorAddress() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.contract_event.holder_address</code>.
     */
    public ContractEventRecord setHolderAddress(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.holder_address</code>.
     */
    public String getHolderAddress() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.contract_event.approved_address</code>.
     */
    public ContractEventRecord setApprovedAddress(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.approved_address</code>.
     */
    public String getApprovedAddress() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.contract_event.from_address</code>.
     */
    public ContractEventRecord setFromAddress(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.from_address</code>.
     */
    public String getFromAddress() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.contract_event.to_address</code>.
     */
    public ContractEventRecord setToAddress(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.to_address</code>.
     */
    public String getToAddress() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.contract_event.value</code>.
     */
    public ContractEventRecord setValue(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.value</code>.
     */
    public BigDecimal getValue() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>public.contract_event.amount</code>.
     */
    public ContractEventRecord setAmount(BigDecimal value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>public.contract_event.token_id</code>.
     */
    public ContractEventRecord setTokenId(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.token_id</code>.
     */
    public BigDecimal getTokenId() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>public.contract_event.id</code>.
     */
    public ContractEventRecord setId(BigDecimal value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>public.contract_event.ids</code>.
     */
    public ContractEventRecord setIds(BigDecimal... value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.ids</code>.
     */
    public BigDecimal[] getIds() {
        return (BigDecimal[]) get(16);
    }

    /**
     * Setter for <code>public.contract_event.values</code>.
     */
    public ContractEventRecord setValues(BigDecimal... value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.values</code>.
     */
    public BigDecimal[] getValues() {
        return (BigDecimal[]) get(17);
    }

    /**
     * Setter for <code>public.contract_event.approved</code>.
     */
    public ContractEventRecord setApproved(Boolean value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.approved</code>.
     */
    public Boolean getApproved() {
        return (Boolean) get(18);
    }

    /**
     * Setter for <code>public.contract_event.data</code>.
     */
    public ContractEventRecord setData(byte... value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.data</code>.
     */
    public byte[] getData() {
        return (byte[]) get(19);
    }

    /**
     * Setter for <code>public.contract_event.operator_data</code>.
     */
    public ContractEventRecord setOperatorData(byte... value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.operator_data</code>.
     */
    public byte[] getOperatorData() {
        return (byte[]) get(20);
    }

    /**
     * Setter for <code>public.contract_event.value_str</code>.
     */
    public ContractEventRecord setValueStr(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_event.value_str</code>.
     */
    public String getValueStr() {
        return (String) get(21);
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row22<Long, String, String, String, ContractEventType, String, String, String, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal[], BigDecimal[], Boolean, byte[], byte[], String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    @Override
    public Row22<Long, String, String, String, ContractEventType, String, String, String, String, String, String, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal[], BigDecimal[], Boolean, byte[], byte[], String> valuesRow() {
        return (Row22) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ContractEvent.CONTRACT_EVENT.BLOCK_NUMBER;
    }

    @Override
    public Field<String> field2() {
        return ContractEvent.CONTRACT_EVENT.BLOCK_HASH;
    }

    @Override
    public Field<String> field3() {
        return ContractEvent.CONTRACT_EVENT.TRANSACTION_HASH;
    }

    @Override
    public Field<String> field4() {
        return ContractEvent.CONTRACT_EVENT.CONTRACT_ADDRESS;
    }

    @Override
    public Field<ContractEventType> field5() {
        return ContractEvent.CONTRACT_EVENT.TYPE;
    }

    @Override
    public Field<String> field6() {
        return ContractEvent.CONTRACT_EVENT.OWNER_ADDRESS;
    }

    @Override
    public Field<String> field7() {
        return ContractEvent.CONTRACT_EVENT.SPENDER_ADDRESS;
    }

    @Override
    public Field<String> field8() {
        return ContractEvent.CONTRACT_EVENT.OPERATOR_ADDRESS;
    }

    @Override
    public Field<String> field9() {
        return ContractEvent.CONTRACT_EVENT.HOLDER_ADDRESS;
    }

    @Override
    public Field<String> field10() {
        return ContractEvent.CONTRACT_EVENT.APPROVED_ADDRESS;
    }

    @Override
    public Field<String> field11() {
        return ContractEvent.CONTRACT_EVENT.FROM_ADDRESS;
    }

    @Override
    public Field<String> field12() {
        return ContractEvent.CONTRACT_EVENT.TO_ADDRESS;
    }

    @Override
    public Field<BigDecimal> field13() {
        return ContractEvent.CONTRACT_EVENT.VALUE;
    }

    @Override
    public Field<BigDecimal> field14() {
        return ContractEvent.CONTRACT_EVENT.AMOUNT;
    }

    @Override
    public Field<BigDecimal> field15() {
        return ContractEvent.CONTRACT_EVENT.TOKEN_ID;
    }

    @Override
    public Field<BigDecimal> field16() {
        return ContractEvent.CONTRACT_EVENT.ID;
    }

    @Override
    public Field<BigDecimal[]> field17() {
        return ContractEvent.CONTRACT_EVENT.IDS;
    }

    @Override
    public Field<BigDecimal[]> field18() {
        return ContractEvent.CONTRACT_EVENT.VALUES;
    }

    @Override
    public Field<Boolean> field19() {
        return ContractEvent.CONTRACT_EVENT.APPROVED;
    }

    @Override
    public Field<byte[]> field20() {
        return ContractEvent.CONTRACT_EVENT.DATA;
    }

    @Override
    public Field<byte[]> field21() {
        return ContractEvent.CONTRACT_EVENT.OPERATOR_DATA;
    }

    @Override
    public Field<String> field22() {
        return ContractEvent.CONTRACT_EVENT.VALUE_STR;
    }

    @Override
    public Long component1() {
        return getBlockNumber();
    }

    @Override
    public String component2() {
        return getBlockHash();
    }

    @Override
    public String component3() {
        return getTransactionHash();
    }

    @Override
    public String component4() {
        return getContractAddress();
    }

    @Override
    public ContractEventType component5() {
        return getType();
    }

    @Override
    public String component6() {
        return getOwnerAddress();
    }

    @Override
    public String component7() {
        return getSpenderAddress();
    }

    @Override
    public String component8() {
        return getOperatorAddress();
    }

    @Override
    public String component9() {
        return getHolderAddress();
    }

    @Override
    public String component10() {
        return getApprovedAddress();
    }

    @Override
    public String component11() {
        return getFromAddress();
    }

    @Override
    public String component12() {
        return getToAddress();
    }

    @Override
    public BigDecimal component13() {
        return getValue();
    }

    @Override
    public BigDecimal component14() {
        return getAmount();
    }

    @Override
    public BigDecimal component15() {
        return getTokenId();
    }

    @Override
    public BigDecimal component16() {
        return getId();
    }

    @Override
    public BigDecimal[] component17() {
        return getIds();
    }

    @Override
    public BigDecimal[] component18() {
        return getValues();
    }

    @Override
    public Boolean component19() {
        return getApproved();
    }

    @Override
    public byte[] component20() {
        return getData();
    }

    @Override
    public byte[] component21() {
        return getOperatorData();
    }

    @Override
    public String component22() {
        return getValueStr();
    }

    @Override
    public Long value1() {
        return getBlockNumber();
    }

    @Override
    public String value2() {
        return getBlockHash();
    }

    @Override
    public String value3() {
        return getTransactionHash();
    }

    @Override
    public String value4() {
        return getContractAddress();
    }

    @Override
    public ContractEventType value5() {
        return getType();
    }

    @Override
    public String value6() {
        return getOwnerAddress();
    }

    @Override
    public String value7() {
        return getSpenderAddress();
    }

    @Override
    public String value8() {
        return getOperatorAddress();
    }

    @Override
    public String value9() {
        return getHolderAddress();
    }

    @Override
    public String value10() {
        return getApprovedAddress();
    }

    @Override
    public String value11() {
        return getFromAddress();
    }

    @Override
    public String value12() {
        return getToAddress();
    }

    @Override
    public BigDecimal value13() {
        return getValue();
    }

    @Override
    public BigDecimal value14() {
        return getAmount();
    }

    @Override
    public BigDecimal value15() {
        return getTokenId();
    }

    @Override
    public BigDecimal value16() {
        return getId();
    }

    @Override
    public BigDecimal[] value17() {
        return getIds();
    }

    @Override
    public BigDecimal[] value18() {
        return getValues();
    }

    @Override
    public Boolean value19() {
        return getApproved();
    }

    @Override
    public byte[] value20() {
        return getData();
    }

    @Override
    public byte[] value21() {
        return getOperatorData();
    }

    @Override
    public String value22() {
        return getValueStr();
    }

    @Override
    public ContractEventRecord value1(Long value) {
        setBlockNumber(value);
        return this;
    }

    @Override
    public ContractEventRecord value2(String value) {
        setBlockHash(value);
        return this;
    }

    @Override
    public ContractEventRecord value3(String value) {
        setTransactionHash(value);
        return this;
    }

    @Override
    public ContractEventRecord value4(String value) {
        setContractAddress(value);
        return this;
    }

    @Override
    public ContractEventRecord value5(ContractEventType value) {
        setType(value);
        return this;
    }

    @Override
    public ContractEventRecord value6(String value) {
        setOwnerAddress(value);
        return this;
    }

    @Override
    public ContractEventRecord value7(String value) {
        setSpenderAddress(value);
        return this;
    }

    @Override
    public ContractEventRecord value8(String value) {
        setOperatorAddress(value);
        return this;
    }

    @Override
    public ContractEventRecord value9(String value) {
        setHolderAddress(value);
        return this;
    }

    @Override
    public ContractEventRecord value10(String value) {
        setApprovedAddress(value);
        return this;
    }

    @Override
    public ContractEventRecord value11(String value) {
        setFromAddress(value);
        return this;
    }

    @Override
    public ContractEventRecord value12(String value) {
        setToAddress(value);
        return this;
    }

    @Override
    public ContractEventRecord value13(BigDecimal value) {
        setValue(value);
        return this;
    }

    @Override
    public ContractEventRecord value14(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public ContractEventRecord value15(BigDecimal value) {
        setTokenId(value);
        return this;
    }

    @Override
    public ContractEventRecord value16(BigDecimal value) {
        setId(value);
        return this;
    }

    @Override
    public ContractEventRecord value17(BigDecimal... value) {
        setIds(value);
        return this;
    }

    @Override
    public ContractEventRecord value18(BigDecimal... value) {
        setValues(value);
        return this;
    }

    @Override
    public ContractEventRecord value19(Boolean value) {
        setApproved(value);
        return this;
    }

    @Override
    public ContractEventRecord value20(byte... value) {
        setData(value);
        return this;
    }

    @Override
    public ContractEventRecord value21(byte... value) {
        setOperatorData(value);
        return this;
    }

    @Override
    public ContractEventRecord value22(String value) {
        setValueStr(value);
        return this;
    }

    @Override
    public ContractEventRecord values(Long value1, String value2, String value3, String value4, ContractEventType value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, BigDecimal value13, BigDecimal value14, BigDecimal value15, BigDecimal value16, BigDecimal[] value17, BigDecimal[] value18, Boolean value19, byte[] value20, byte[] value21, String value22) {
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
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ContractEventRecord
     */
    public ContractEventRecord() {
        super(ContractEvent.CONTRACT_EVENT);
    }

    /**
     * Create a detached, initialised ContractEventRecord
     */
    public ContractEventRecord(Long blockNumber, String blockHash, String transactionHash, String contractAddress, ContractEventType type, String ownerAddress, String spenderAddress, String operatorAddress, String holderAddress, String approvedAddress, String fromAddress, String toAddress, BigDecimal value, BigDecimal amount, BigDecimal tokenId, BigDecimal id, BigDecimal[] ids, BigDecimal[] values, Boolean approved, byte[] data, byte[] operatorData, String valueStr) {
        super(ContractEvent.CONTRACT_EVENT);

        set(0, blockNumber);
        set(1, blockHash);
        set(2, transactionHash);
        set(3, contractAddress);
        set(4, type);
        set(5, ownerAddress);
        set(6, spenderAddress);
        set(7, operatorAddress);
        set(8, holderAddress);
        set(9, approvedAddress);
        set(10, fromAddress);
        set(11, toAddress);
        set(12, value);
        set(13, amount);
        set(14, tokenId);
        set(15, id);
        set(16, ids);
        set(17, values);
        set(18, approved);
        set(19, data);
        set(20, operatorData);
        set(21, valueStr);
    }
}
