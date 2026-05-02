# TouhouLittleMaidAddon-ESchest

Standalone Fabric addon for Touhou Little Maid that adds ExpandedStorage chest compatibility.

## Layout

- `src/main/java/cn/sh1rocu/touhoulittlemaidaddon/eschest/` - addon entrypoint and compat code
- `src/main/resources/` - Fabric metadata and mixin config
- `build.gradle` - Fabric Loom build setup

## Build

1. Build the main project first so the Touhou Little Maid jar exists in `../TouhouLittleMaid-Orihime/build/libs/`.
2. Then build this addon with Gradle.

Example:

```powershell
cd "d:\MC相关\1.21.1\模组练习\TouhouLittleMaidAddon-ESchest"
.\gradlew build
```

If you prefer, you can also use the existing Touhou Little Maid build output as the compile-only dependency for this addon.
