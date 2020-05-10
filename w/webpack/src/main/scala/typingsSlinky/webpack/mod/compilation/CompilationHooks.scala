package typingsSlinky.webpack.mod.compilation

import typingsSlinky.tapable.mod.AsyncSeriesHook
import typingsSlinky.tapable.mod.SyncBailHook
import typingsSlinky.tapable.mod.SyncHook
import typingsSlinky.tapable.mod.SyncWaterfallHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompilationHooks extends js.Object {
  var additionalAssets: AsyncSeriesHook[_, _, _] = js.native
  var additionalChunkAssets: SyncHook[js.Array[Chunk], _, _] = js.native
  var advancedOptimizeModuleOrder: SyncHook[js.Array[Module], _, _] = js.native
  var afterHash: SyncHook[_, _, _] = js.native
  var afterOptimizeAssets: SyncHook[js.Array[Asset], _, _] = js.native
  var afterOptimizeChunkAssets: SyncHook[js.Array[Chunk], _, _] = js.native
  var afterOptimizeChunkIds: SyncHook[js.Array[Chunk], _, _] = js.native
  var afterOptimizeChunkModules: SyncHook[js.Array[Chunk], js.Array[Module], _] = js.native
  var afterOptimizeChunks: SyncHook[js.Array[Chunk], js.Array[ChunkGroup], _] = js.native
  var afterOptimizeDependencies: SyncHook[js.Array[Module], _, _] = js.native
  var afterOptimizeExtractedChunks: SyncHook[js.Array[Chunk], _, _] = js.native
  var afterOptimizeModuleIds: SyncHook[js.Array[Module], _, _] = js.native
  var afterOptimizeModules: SyncHook[js.Array[Module], _, _] = js.native
  var afterOptimizeTree: SyncHook[js.Array[Chunk], js.Array[Module], _] = js.native
  var afterSeal: AsyncSeriesHook[_, _, _] = js.native
  var assetPath: SyncWaterfallHook[String, _, _] = js.native
  var beforeChunkAssets: SyncHook[_, _, _] = js.native
  var beforeChunkIds: SyncHook[js.Array[Chunk], _, _] = js.native
  var beforeHash: SyncHook[_, _, _] = js.native
  var beforeModuleAssets: SyncHook[_, _, _] = js.native
  var beforeModuleIds: SyncHook[js.Array[Module], _, _] = js.native
  var buildModule: SyncHook[Module, _, _] = js.native
  var childCompiler: SyncHook[_, _, _] = js.native
  var chunkAsset: SyncHook[Chunk, String, _] = js.native
  var chunkHash: SyncHook[Chunk, ChunkHash, _] = js.native
  var failedModule: SyncHook[Module, js.Error, _] = js.native
  var finishModules: SyncHook[js.Array[Module], _, _] = js.native
  var finishRebuildingModule: SyncHook[Module, _, _] = js.native
  var moduleAsset: SyncHook[Module, String, _] = js.native
  var moduleIds: SyncHook[js.Array[Module], _, _] = js.native
  var needAdditionalPass: SyncBailHook[_, _, _, _] = js.native
  var needAdditionalSeal: SyncBailHook[_, _, _, _] = js.native
  var normalModuleLoader: SyncHook[_, Module, _] = js.native
  var optimize: SyncHook[_, _, _] = js.native
  var optimizeAssets: AsyncSeriesHook[js.Array[Asset], _, _] = js.native
  var optimizeChunkAssets: AsyncSeriesHook[js.Array[Chunk], _, _] = js.native
  var optimizeChunkIds: SyncHook[js.Array[Chunk], _, _] = js.native
  var optimizeChunkModules: SyncBailHook[js.Array[Chunk], js.Array[Module], _, _] = js.native
  var optimizeChunkModulesAdvanced: SyncBailHook[js.Array[Chunk], js.Array[Module], _, _] = js.native
  var optimizeChunkModulesBasic: SyncBailHook[js.Array[Chunk], js.Array[Module], _, _] = js.native
  var optimizeChunkOrder: SyncHook[js.Array[Chunk], _, _] = js.native
  var optimizeChunks: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _] = js.native
  var optimizeChunksAdvanced: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _] = js.native
  var optimizeChunksBasic: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _] = js.native
  var optimizeDependencies: SyncBailHook[js.Array[Module], _, _, _] = js.native
  var optimizeDependenciesAdvanced: SyncBailHook[js.Array[Module], _, _, _] = js.native
  var optimizeDependenciesBasic: SyncBailHook[js.Array[Module], _, _, _] = js.native
  var optimizeExtractedChunks: SyncBailHook[js.Array[Chunk], _, _, _] = js.native
  var optimizeExtractedChunksAdvanced: SyncBailHook[js.Array[Chunk], _, _, _] = js.native
  var optimizeExtractedChunksBasic: SyncBailHook[js.Array[Chunk], _, _, _] = js.native
  var optimizeModuleIds: SyncHook[js.Array[Module], _, _] = js.native
  var optimizeModuleOrder: SyncHook[js.Array[Module], _, _] = js.native
  var optimizeModules: SyncBailHook[js.Array[Module], _, _, _] = js.native
  var optimizeModulesAdvanced: SyncBailHook[js.Array[Module], _, _, _] = js.native
  var optimizeModulesBasic: SyncBailHook[js.Array[Module], _, _, _] = js.native
  var optimizeTree: AsyncSeriesHook[js.Array[Chunk], js.Array[Module], _] = js.native
  var rebuildModule: SyncHook[Module, _, _] = js.native
  var record: SyncHook[Compilation, js.Array[Record], _] = js.native
  var recordChunks: SyncHook[js.Array[Chunk], js.Array[Record], _] = js.native
  var recordHash: SyncHook[js.Array[Record], _, _] = js.native
  var recordModules: SyncHook[js.Array[Module], js.Array[Record], _] = js.native
  var records: SyncHook[Compilation, js.Array[Record], _] = js.native
  var reviveChunks: SyncHook[js.Array[Chunk], js.Array[Record], _] = js.native
  var reviveModules: SyncHook[js.Array[Module], js.Array[Record], _] = js.native
  var seal: SyncHook[_, _, _] = js.native
  var shouldGenerateChunkAssets: SyncBailHook[_, _, _, _] = js.native
  var shouldRecord: SyncBailHook[_, _, _, _] = js.native
  var succeedModule: SyncHook[Module, _, _] = js.native
  var unseal: SyncHook[_, _, _] = js.native
}

object CompilationHooks {
  @scala.inline
  def apply(
    additionalAssets: AsyncSeriesHook[_, _, _],
    additionalChunkAssets: SyncHook[js.Array[Chunk], _, _],
    advancedOptimizeModuleOrder: SyncHook[js.Array[Module], _, _],
    afterHash: SyncHook[_, _, _],
    afterOptimizeAssets: SyncHook[js.Array[Asset], _, _],
    afterOptimizeChunkAssets: SyncHook[js.Array[Chunk], _, _],
    afterOptimizeChunkIds: SyncHook[js.Array[Chunk], _, _],
    afterOptimizeChunkModules: SyncHook[js.Array[Chunk], js.Array[Module], _],
    afterOptimizeChunks: SyncHook[js.Array[Chunk], js.Array[ChunkGroup], _],
    afterOptimizeDependencies: SyncHook[js.Array[Module], _, _],
    afterOptimizeExtractedChunks: SyncHook[js.Array[Chunk], _, _],
    afterOptimizeModuleIds: SyncHook[js.Array[Module], _, _],
    afterOptimizeModules: SyncHook[js.Array[Module], _, _],
    afterOptimizeTree: SyncHook[js.Array[Chunk], js.Array[Module], _],
    afterSeal: AsyncSeriesHook[_, _, _],
    assetPath: SyncWaterfallHook[String, _, _],
    beforeChunkAssets: SyncHook[_, _, _],
    beforeChunkIds: SyncHook[js.Array[Chunk], _, _],
    beforeHash: SyncHook[_, _, _],
    beforeModuleAssets: SyncHook[_, _, _],
    beforeModuleIds: SyncHook[js.Array[Module], _, _],
    buildModule: SyncHook[Module, _, _],
    childCompiler: SyncHook[_, _, _],
    chunkAsset: SyncHook[Chunk, String, _],
    chunkHash: SyncHook[Chunk, ChunkHash, _],
    failedModule: SyncHook[Module, js.Error, _],
    finishModules: SyncHook[js.Array[Module], _, _],
    finishRebuildingModule: SyncHook[Module, _, _],
    moduleAsset: SyncHook[Module, String, _],
    moduleIds: SyncHook[js.Array[Module], _, _],
    needAdditionalPass: SyncBailHook[_, _, _, _],
    needAdditionalSeal: SyncBailHook[_, _, _, _],
    normalModuleLoader: SyncHook[_, Module, _],
    optimize: SyncHook[_, _, _],
    optimizeAssets: AsyncSeriesHook[js.Array[Asset], _, _],
    optimizeChunkAssets: AsyncSeriesHook[js.Array[Chunk], _, _],
    optimizeChunkIds: SyncHook[js.Array[Chunk], _, _],
    optimizeChunkModules: SyncBailHook[js.Array[Chunk], js.Array[Module], _, _],
    optimizeChunkModulesAdvanced: SyncBailHook[js.Array[Chunk], js.Array[Module], _, _],
    optimizeChunkModulesBasic: SyncBailHook[js.Array[Chunk], js.Array[Module], _, _],
    optimizeChunkOrder: SyncHook[js.Array[Chunk], _, _],
    optimizeChunks: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _],
    optimizeChunksAdvanced: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _],
    optimizeChunksBasic: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _],
    optimizeDependencies: SyncBailHook[js.Array[Module], _, _, _],
    optimizeDependenciesAdvanced: SyncBailHook[js.Array[Module], _, _, _],
    optimizeDependenciesBasic: SyncBailHook[js.Array[Module], _, _, _],
    optimizeExtractedChunks: SyncBailHook[js.Array[Chunk], _, _, _],
    optimizeExtractedChunksAdvanced: SyncBailHook[js.Array[Chunk], _, _, _],
    optimizeExtractedChunksBasic: SyncBailHook[js.Array[Chunk], _, _, _],
    optimizeModuleIds: SyncHook[js.Array[Module], _, _],
    optimizeModuleOrder: SyncHook[js.Array[Module], _, _],
    optimizeModules: SyncBailHook[js.Array[Module], _, _, _],
    optimizeModulesAdvanced: SyncBailHook[js.Array[Module], _, _, _],
    optimizeModulesBasic: SyncBailHook[js.Array[Module], _, _, _],
    optimizeTree: AsyncSeriesHook[js.Array[Chunk], js.Array[Module], _],
    rebuildModule: SyncHook[Module, _, _],
    record: SyncHook[Compilation, js.Array[Record], _],
    recordChunks: SyncHook[js.Array[Chunk], js.Array[Record], _],
    recordHash: SyncHook[js.Array[Record], _, _],
    recordModules: SyncHook[js.Array[Module], js.Array[Record], _],
    records: SyncHook[Compilation, js.Array[Record], _],
    reviveChunks: SyncHook[js.Array[Chunk], js.Array[Record], _],
    reviveModules: SyncHook[js.Array[Module], js.Array[Record], _],
    seal: SyncHook[_, _, _],
    shouldGenerateChunkAssets: SyncBailHook[_, _, _, _],
    shouldRecord: SyncBailHook[_, _, _, _],
    succeedModule: SyncHook[Module, _, _],
    unseal: SyncHook[_, _, _]
  ): CompilationHooks = {
    val __obj = js.Dynamic.literal(additionalAssets = additionalAssets.asInstanceOf[js.Any], additionalChunkAssets = additionalChunkAssets.asInstanceOf[js.Any], advancedOptimizeModuleOrder = advancedOptimizeModuleOrder.asInstanceOf[js.Any], afterHash = afterHash.asInstanceOf[js.Any], afterOptimizeAssets = afterOptimizeAssets.asInstanceOf[js.Any], afterOptimizeChunkAssets = afterOptimizeChunkAssets.asInstanceOf[js.Any], afterOptimizeChunkIds = afterOptimizeChunkIds.asInstanceOf[js.Any], afterOptimizeChunkModules = afterOptimizeChunkModules.asInstanceOf[js.Any], afterOptimizeChunks = afterOptimizeChunks.asInstanceOf[js.Any], afterOptimizeDependencies = afterOptimizeDependencies.asInstanceOf[js.Any], afterOptimizeExtractedChunks = afterOptimizeExtractedChunks.asInstanceOf[js.Any], afterOptimizeModuleIds = afterOptimizeModuleIds.asInstanceOf[js.Any], afterOptimizeModules = afterOptimizeModules.asInstanceOf[js.Any], afterOptimizeTree = afterOptimizeTree.asInstanceOf[js.Any], afterSeal = afterSeal.asInstanceOf[js.Any], assetPath = assetPath.asInstanceOf[js.Any], beforeChunkAssets = beforeChunkAssets.asInstanceOf[js.Any], beforeChunkIds = beforeChunkIds.asInstanceOf[js.Any], beforeHash = beforeHash.asInstanceOf[js.Any], beforeModuleAssets = beforeModuleAssets.asInstanceOf[js.Any], beforeModuleIds = beforeModuleIds.asInstanceOf[js.Any], buildModule = buildModule.asInstanceOf[js.Any], childCompiler = childCompiler.asInstanceOf[js.Any], chunkAsset = chunkAsset.asInstanceOf[js.Any], chunkHash = chunkHash.asInstanceOf[js.Any], failedModule = failedModule.asInstanceOf[js.Any], finishModules = finishModules.asInstanceOf[js.Any], finishRebuildingModule = finishRebuildingModule.asInstanceOf[js.Any], moduleAsset = moduleAsset.asInstanceOf[js.Any], moduleIds = moduleIds.asInstanceOf[js.Any], needAdditionalPass = needAdditionalPass.asInstanceOf[js.Any], needAdditionalSeal = needAdditionalSeal.asInstanceOf[js.Any], normalModuleLoader = normalModuleLoader.asInstanceOf[js.Any], optimize = optimize.asInstanceOf[js.Any], optimizeAssets = optimizeAssets.asInstanceOf[js.Any], optimizeChunkAssets = optimizeChunkAssets.asInstanceOf[js.Any], optimizeChunkIds = optimizeChunkIds.asInstanceOf[js.Any], optimizeChunkModules = optimizeChunkModules.asInstanceOf[js.Any], optimizeChunkModulesAdvanced = optimizeChunkModulesAdvanced.asInstanceOf[js.Any], optimizeChunkModulesBasic = optimizeChunkModulesBasic.asInstanceOf[js.Any], optimizeChunkOrder = optimizeChunkOrder.asInstanceOf[js.Any], optimizeChunks = optimizeChunks.asInstanceOf[js.Any], optimizeChunksAdvanced = optimizeChunksAdvanced.asInstanceOf[js.Any], optimizeChunksBasic = optimizeChunksBasic.asInstanceOf[js.Any], optimizeDependencies = optimizeDependencies.asInstanceOf[js.Any], optimizeDependenciesAdvanced = optimizeDependenciesAdvanced.asInstanceOf[js.Any], optimizeDependenciesBasic = optimizeDependenciesBasic.asInstanceOf[js.Any], optimizeExtractedChunks = optimizeExtractedChunks.asInstanceOf[js.Any], optimizeExtractedChunksAdvanced = optimizeExtractedChunksAdvanced.asInstanceOf[js.Any], optimizeExtractedChunksBasic = optimizeExtractedChunksBasic.asInstanceOf[js.Any], optimizeModuleIds = optimizeModuleIds.asInstanceOf[js.Any], optimizeModuleOrder = optimizeModuleOrder.asInstanceOf[js.Any], optimizeModules = optimizeModules.asInstanceOf[js.Any], optimizeModulesAdvanced = optimizeModulesAdvanced.asInstanceOf[js.Any], optimizeModulesBasic = optimizeModulesBasic.asInstanceOf[js.Any], optimizeTree = optimizeTree.asInstanceOf[js.Any], rebuildModule = rebuildModule.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any], recordChunks = recordChunks.asInstanceOf[js.Any], recordHash = recordHash.asInstanceOf[js.Any], recordModules = recordModules.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], reviveChunks = reviveChunks.asInstanceOf[js.Any], reviveModules = reviveModules.asInstanceOf[js.Any], seal = seal.asInstanceOf[js.Any], shouldGenerateChunkAssets = shouldGenerateChunkAssets.asInstanceOf[js.Any], shouldRecord = shouldRecord.asInstanceOf[js.Any], succeedModule = succeedModule.asInstanceOf[js.Any], unseal = unseal.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationHooks]
  }
  @scala.inline
  implicit class CompilationHooksOps[Self <: CompilationHooks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalAssets(value: AsyncSeriesHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalChunkAssets(value: SyncHook[js.Array[Chunk], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalChunkAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdvancedOptimizeModuleOrder(value: SyncHook[js.Array[Module], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advancedOptimizeModuleOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterHash(value: SyncHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterOptimizeAssets(value: SyncHook[js.Array[Asset], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOptimizeAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterOptimizeChunkAssets(value: SyncHook[js.Array[Chunk], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOptimizeChunkAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterOptimizeChunkIds(value: SyncHook[js.Array[Chunk], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOptimizeChunkIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterOptimizeChunkModules(value: SyncHook[js.Array[Chunk], js.Array[Module], _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOptimizeChunkModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterOptimizeChunks(value: SyncHook[js.Array[Chunk], js.Array[ChunkGroup], _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOptimizeChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterOptimizeDependencies(value: SyncHook[js.Array[Module], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOptimizeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterOptimizeExtractedChunks(value: SyncHook[js.Array[Chunk], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOptimizeExtractedChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterOptimizeModuleIds(value: SyncHook[js.Array[Module], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOptimizeModuleIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterOptimizeModules(value: SyncHook[js.Array[Module], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOptimizeModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterOptimizeTree(value: SyncHook[js.Array[Chunk], js.Array[Module], _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterOptimizeTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterSeal(value: AsyncSeriesHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterSeal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssetPath(value: SyncWaterfallHook[String, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeChunkAssets(value: SyncHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChunkAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeChunkIds(value: SyncHook[js.Array[Chunk], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChunkIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeHash(value: SyncHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeModuleAssets(value: SyncHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeModuleAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeModuleIds(value: SyncHook[js.Array[Module], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeModuleIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildModule(value: SyncHook[Module, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildCompiler(value: SyncHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childCompiler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChunkAsset(value: SyncHook[Chunk, String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChunkHash(value: SyncHook[Chunk, ChunkHash, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFailedModule(value: SyncHook[Module, js.Error, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishModules(value: SyncHook[js.Array[Module], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinishRebuildingModule(value: SyncHook[Module, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finishRebuildingModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleAsset(value: SyncHook[Module, String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleIds(value: SyncHook[js.Array[Module], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedAdditionalPass(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needAdditionalPass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeedAdditionalSeal(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needAdditionalSeal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalModuleLoader(value: SyncHook[_, Module, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalModuleLoader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimize(value: SyncHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeAssets(value: AsyncSeriesHook[js.Array[Asset], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeChunkAssets(value: AsyncSeriesHook[js.Array[Chunk], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeChunkAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeChunkIds(value: SyncHook[js.Array[Chunk], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeChunkIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeChunkModules(value: SyncBailHook[js.Array[Chunk], js.Array[Module], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeChunkModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeChunkModulesAdvanced(value: SyncBailHook[js.Array[Chunk], js.Array[Module], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeChunkModulesAdvanced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeChunkModulesBasic(value: SyncBailHook[js.Array[Chunk], js.Array[Module], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeChunkModulesBasic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeChunkOrder(value: SyncHook[js.Array[Chunk], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeChunkOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeChunks(value: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeChunksAdvanced(value: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeChunksAdvanced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeChunksBasic(value: SyncBailHook[js.Array[Chunk], js.Array[ChunkGroup], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeChunksBasic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeDependencies(value: SyncBailHook[js.Array[Module], _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeDependenciesAdvanced(value: SyncBailHook[js.Array[Module], _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeDependenciesAdvanced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeDependenciesBasic(value: SyncBailHook[js.Array[Module], _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeDependenciesBasic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeExtractedChunks(value: SyncBailHook[js.Array[Chunk], _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeExtractedChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeExtractedChunksAdvanced(value: SyncBailHook[js.Array[Chunk], _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeExtractedChunksAdvanced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeExtractedChunksBasic(value: SyncBailHook[js.Array[Chunk], _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeExtractedChunksBasic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeModuleIds(value: SyncHook[js.Array[Module], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeModuleIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeModuleOrder(value: SyncHook[js.Array[Module], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeModuleOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeModules(value: SyncBailHook[js.Array[Module], _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeModulesAdvanced(value: SyncBailHook[js.Array[Module], _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeModulesAdvanced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeModulesBasic(value: SyncBailHook[js.Array[Module], _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeModulesBasic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptimizeTree(value: AsyncSeriesHook[js.Array[Chunk], js.Array[Module], _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizeTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRebuildModule(value: SyncHook[Module, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebuildModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecord(value: SyncHook[Compilation, js.Array[Record], _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("record")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordChunks(value: SyncHook[js.Array[Chunk], js.Array[Record], _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordHash(value: SyncHook[js.Array[Record], _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordModules(value: SyncHook[js.Array[Module], js.Array[Record], _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecords(value: SyncHook[Compilation, js.Array[Record], _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviveChunks(value: SyncHook[js.Array[Chunk], js.Array[Record], _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviveChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReviveModules(value: SyncHook[js.Array[Module], js.Array[Record], _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reviveModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeal(value: SyncHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldGenerateChunkAssets(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldGenerateChunkAssets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldRecord(value: SyncBailHook[_, _, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRecord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSucceedModule(value: SyncHook[Module, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("succeedModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnseal(value: SyncHook[_, _, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unseal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

