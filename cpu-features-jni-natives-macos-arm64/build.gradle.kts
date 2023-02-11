plugins {
    id("natives-conventions")
}

natives {
    platformPredicate.set { it.isMacOsX }
    bindingsFileName.set("libcpu-features-jni-bindings.dylib")
    destInnerDir.set("macos_arm64")
}