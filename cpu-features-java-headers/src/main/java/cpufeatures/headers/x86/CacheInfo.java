// Generated by jextract

package cpufeatures.headers.x86;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.PathElement;
public class CacheInfo {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("size"),
        MemoryLayout.sequenceLayout(10, MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("level"),
            Constants$root.C_INT$LAYOUT.withName("cache_type"),
            Constants$root.C_INT$LAYOUT.withName("cache_size"),
            Constants$root.C_INT$LAYOUT.withName("ways"),
            Constants$root.C_INT$LAYOUT.withName("line_size"),
            Constants$root.C_INT$LAYOUT.withName("tlb_entries"),
            Constants$root.C_INT$LAYOUT.withName("partitioning")
        )).withName("levels")
    );
    public static MemoryLayout $LAYOUT() {
        return CacheInfo.$struct$LAYOUT;
    }
    static final VarHandle size$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("size"));
    public static VarHandle size$VH() {
        return CacheInfo.size$VH;
    }
    public static int size$get(MemorySegment seg) {
        return (int)CacheInfo.size$VH.get(seg);
    }
    public static void size$set( MemorySegment seg, int x) {
        CacheInfo.size$VH.set(seg, x);
    }
    public static int size$get(MemorySegment seg, long index) {
        return (int)CacheInfo.size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void size$set(MemorySegment seg, long index, int x) {
        CacheInfo.size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment levels$slice(MemorySegment seg) {
        return seg.asSlice(4, 280);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

