// Generated by jextract

package cpufeatures.natives;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.PathElement;
public class CacheLevelInfo {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("level"),
        Constants$root.C_INT$LAYOUT.withName("cache_type"),
        Constants$root.C_INT$LAYOUT.withName("cache_size"),
        Constants$root.C_INT$LAYOUT.withName("ways"),
        Constants$root.C_INT$LAYOUT.withName("line_size"),
        Constants$root.C_INT$LAYOUT.withName("tlb_entries"),
        Constants$root.C_INT$LAYOUT.withName("partitioning")
    );
    public static MemoryLayout $LAYOUT() {
        return CacheLevelInfo.$struct$LAYOUT;
    }
    static final VarHandle level$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("level"));
    public static VarHandle level$VH() {
        return CacheLevelInfo.level$VH;
    }
    public static int level$get(MemorySegment seg) {
        return (int)CacheLevelInfo.level$VH.get(seg);
    }
    public static void level$set( MemorySegment seg, int x) {
        CacheLevelInfo.level$VH.set(seg, x);
    }
    public static int level$get(MemorySegment seg, long index) {
        return (int)CacheLevelInfo.level$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void level$set(MemorySegment seg, long index, int x) {
        CacheLevelInfo.level$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cache_type$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("cache_type"));
    public static VarHandle cache_type$VH() {
        return CacheLevelInfo.cache_type$VH;
    }
    public static int cache_type$get(MemorySegment seg) {
        return (int)CacheLevelInfo.cache_type$VH.get(seg);
    }
    public static void cache_type$set( MemorySegment seg, int x) {
        CacheLevelInfo.cache_type$VH.set(seg, x);
    }
    public static int cache_type$get(MemorySegment seg, long index) {
        return (int)CacheLevelInfo.cache_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cache_type$set(MemorySegment seg, long index, int x) {
        CacheLevelInfo.cache_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cache_size$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("cache_size"));
    public static VarHandle cache_size$VH() {
        return CacheLevelInfo.cache_size$VH;
    }
    public static int cache_size$get(MemorySegment seg) {
        return (int)CacheLevelInfo.cache_size$VH.get(seg);
    }
    public static void cache_size$set( MemorySegment seg, int x) {
        CacheLevelInfo.cache_size$VH.set(seg, x);
    }
    public static int cache_size$get(MemorySegment seg, long index) {
        return (int)CacheLevelInfo.cache_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cache_size$set(MemorySegment seg, long index, int x) {
        CacheLevelInfo.cache_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ways$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("ways"));
    public static VarHandle ways$VH() {
        return CacheLevelInfo.ways$VH;
    }
    public static int ways$get(MemorySegment seg) {
        return (int)CacheLevelInfo.ways$VH.get(seg);
    }
    public static void ways$set( MemorySegment seg, int x) {
        CacheLevelInfo.ways$VH.set(seg, x);
    }
    public static int ways$get(MemorySegment seg, long index) {
        return (int)CacheLevelInfo.ways$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ways$set(MemorySegment seg, long index, int x) {
        CacheLevelInfo.ways$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle line_size$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("line_size"));
    public static VarHandle line_size$VH() {
        return CacheLevelInfo.line_size$VH;
    }
    public static int line_size$get(MemorySegment seg) {
        return (int)CacheLevelInfo.line_size$VH.get(seg);
    }
    public static void line_size$set( MemorySegment seg, int x) {
        CacheLevelInfo.line_size$VH.set(seg, x);
    }
    public static int line_size$get(MemorySegment seg, long index) {
        return (int)CacheLevelInfo.line_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void line_size$set(MemorySegment seg, long index, int x) {
        CacheLevelInfo.line_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tlb_entries$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("tlb_entries"));
    public static VarHandle tlb_entries$VH() {
        return CacheLevelInfo.tlb_entries$VH;
    }
    public static int tlb_entries$get(MemorySegment seg) {
        return (int)CacheLevelInfo.tlb_entries$VH.get(seg);
    }
    public static void tlb_entries$set( MemorySegment seg, int x) {
        CacheLevelInfo.tlb_entries$VH.set(seg, x);
    }
    public static int tlb_entries$get(MemorySegment seg, long index) {
        return (int)CacheLevelInfo.tlb_entries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tlb_entries$set(MemorySegment seg, long index, int x) {
        CacheLevelInfo.tlb_entries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle partitioning$VH = $struct$LAYOUT.varHandle(PathElement.groupElement("partitioning"));
    public static VarHandle partitioning$VH() {
        return CacheLevelInfo.partitioning$VH;
    }
    public static int partitioning$get(MemorySegment seg) {
        return (int)CacheLevelInfo.partitioning$VH.get(seg);
    }
    public static void partitioning$set( MemorySegment seg, int x) {
        CacheLevelInfo.partitioning$VH.set(seg, x);
    }
    public static int partitioning$get(MemorySegment seg, long index) {
        return (int)CacheLevelInfo.partitioning$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void partitioning$set(MemorySegment seg, long index, int x) {
        CacheLevelInfo.partitioning$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


