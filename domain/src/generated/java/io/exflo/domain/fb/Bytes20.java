// automatically generated by the FlatBuffers compiler, do not modify

package io.exflo.domain.fb;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Bytes20 extends Table {
  public static Bytes20 getRootAsBytes20(ByteBuffer _bb) { return getRootAsBytes20(_bb, new Bytes20()); }
  public static Bytes20 getRootAsBytes20(ByteBuffer _bb, Bytes20 obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public Bytes20 __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public byte bytes(int j) { int o = __offset(4); return o != 0 ? bb.get(__vector(o) + j * 1) : 0; }
  public int bytesLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public ByteBuffer bytesAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer bytesInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }

  public static int createBytes20(FlatBufferBuilder builder,
      int bytesOffset) {
    builder.startObject(1);
    Bytes20.addBytes(builder, bytesOffset);
    return Bytes20.endBytes20(builder);
  }

  public static void startBytes20(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addBytes(FlatBufferBuilder builder, int bytesOffset) { builder.addOffset(0, bytesOffset, 0); }
  public static int createBytesVector(FlatBufferBuilder builder, byte[] data) { builder.startVector(1, data.length, 1); for (int i = data.length - 1; i >= 0; i--) builder.addByte(data[i]); return builder.endVector(); }
  public static void startBytesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static int endBytes20(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

