// automatically generated by the FlatBuffers compiler, do not modify

package io.exflo.domain.fb;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class ContractMetadata extends Table {
  public static ContractMetadata getRootAsContractMetadata(ByteBuffer _bb) { return getRootAsContractMetadata(_bb, new ContractMetadata()); }
  public static ContractMetadata getRootAsContractMetadata(ByteBuffer _bb, ContractMetadata obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public ContractMetadata __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer nameInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String symbol() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer symbolAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer symbolInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public byte decimals() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public UInt256 totalSupply() { return totalSupply(new UInt256()); }
  public UInt256 totalSupply(UInt256 obj) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public UInt256 granularity() { return granularity(new UInt256()); }
  public UInt256 granularity(UInt256 obj) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public UInt256 cap() { return cap(new UInt256()); }
  public UInt256 cap(UInt256 obj) { int o = __offset(14); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createContractMetadata(FlatBufferBuilder builder,
      int nameOffset,
      int symbolOffset,
      byte decimals,
      int totalSupplyOffset,
      int granularityOffset,
      int capOffset) {
    builder.startObject(6);
    ContractMetadata.addCap(builder, capOffset);
    ContractMetadata.addGranularity(builder, granularityOffset);
    ContractMetadata.addTotalSupply(builder, totalSupplyOffset);
    ContractMetadata.addSymbol(builder, symbolOffset);
    ContractMetadata.addName(builder, nameOffset);
    ContractMetadata.addDecimals(builder, decimals);
    return ContractMetadata.endContractMetadata(builder);
  }

  public static void startContractMetadata(FlatBufferBuilder builder) { builder.startObject(6); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addSymbol(FlatBufferBuilder builder, int symbolOffset) { builder.addOffset(1, symbolOffset, 0); }
  public static void addDecimals(FlatBufferBuilder builder, byte decimals) { builder.addByte(2, decimals, 0); }
  public static void addTotalSupply(FlatBufferBuilder builder, int totalSupplyOffset) { builder.addOffset(3, totalSupplyOffset, 0); }
  public static void addGranularity(FlatBufferBuilder builder, int granularityOffset) { builder.addOffset(4, granularityOffset, 0); }
  public static void addCap(FlatBufferBuilder builder, int capOffset) { builder.addOffset(5, capOffset, 0); }
  public static int endContractMetadata(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

