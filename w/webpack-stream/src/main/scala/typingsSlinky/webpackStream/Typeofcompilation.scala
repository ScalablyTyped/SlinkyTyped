package typingsSlinky.webpackStream

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.webpack.mod.compilation.Asset
import typingsSlinky.webpack.mod.compilation.Chunk
import typingsSlinky.webpack.mod.compilation.ChunkGroup
import typingsSlinky.webpack.mod.compilation.ChunkHash
import typingsSlinky.webpack.mod.compilation.ChunkTemplate
import typingsSlinky.webpack.mod.compilation.Compilation
import typingsSlinky.webpack.mod.compilation.ContextModuleFactory
import typingsSlinky.webpack.mod.compilation.DependenciesBlock
import typingsSlinky.webpack.mod.compilation.DllModuleFactory
import typingsSlinky.webpack.mod.compilation.HotUpdateChunkTemplate
import typingsSlinky.webpack.mod.compilation.MainTemplate
import typingsSlinky.webpack.mod.compilation.Module
import typingsSlinky.webpack.mod.compilation.ModuleTemplate
import typingsSlinky.webpack.mod.compilation.NormalModuleFactory_
import typingsSlinky.webpack.mod.compilation.Record
import typingsSlinky.webpack.mod.compilation.RuntimeTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcompilation extends js.Object {
  var Asset: Instantiable0[typingsSlinky.webpack.mod.compilation.Asset] = js.native
  var Chunk: Instantiable0[typingsSlinky.webpack.mod.compilation.Chunk] = js.native
  var ChunkGroup: Instantiable0[typingsSlinky.webpack.mod.compilation.ChunkGroup] = js.native
  var ChunkHash: Instantiable0[typingsSlinky.webpack.mod.compilation.ChunkHash] = js.native
  var ChunkTemplate: Instantiable0[typingsSlinky.webpack.mod.compilation.ChunkTemplate] = js.native
  var Compilation: Instantiable0[typingsSlinky.webpack.mod.compilation.Compilation] = js.native
  var ContextModuleFactory: Instantiable0[typingsSlinky.webpack.mod.compilation.ContextModuleFactory] = js.native
  var DependenciesBlock: Instantiable0[typingsSlinky.webpack.mod.compilation.DependenciesBlock] = js.native
  var Dependency: TypeofDependency = js.native
  var DllModuleFactory: Instantiable0[typingsSlinky.webpack.mod.compilation.DllModuleFactory] = js.native
  var HotUpdateChunkTemplate: Instantiable0[typingsSlinky.webpack.mod.compilation.HotUpdateChunkTemplate] = js.native
  var MainTemplate: Instantiable0[typingsSlinky.webpack.mod.compilation.MainTemplate] = js.native
  var Module: Instantiable1[/* type */ String, typingsSlinky.webpack.mod.compilation.Module] = js.native
  var ModuleTemplate: Instantiable0[typingsSlinky.webpack.mod.compilation.ModuleTemplate] = js.native
  var NormalModuleFactory: Instantiable0[NormalModuleFactory_] = js.native
  var Record: Instantiable0[typingsSlinky.webpack.mod.compilation.Record] = js.native
  var RuntimeTemplate: Instantiable0[typingsSlinky.webpack.mod.compilation.RuntimeTemplate] = js.native
  val normalModuleFactory: TypeofnormalModuleFactory = js.native
}

object Typeofcompilation {
  @scala.inline
  def apply(
    Asset: Instantiable0[Asset],
    Chunk: Instantiable0[Chunk],
    ChunkGroup: Instantiable0[ChunkGroup],
    ChunkHash: Instantiable0[ChunkHash],
    ChunkTemplate: Instantiable0[ChunkTemplate],
    Compilation: Instantiable0[Compilation],
    ContextModuleFactory: Instantiable0[ContextModuleFactory],
    DependenciesBlock: Instantiable0[DependenciesBlock],
    Dependency: TypeofDependency,
    DllModuleFactory: Instantiable0[DllModuleFactory],
    HotUpdateChunkTemplate: Instantiable0[HotUpdateChunkTemplate],
    MainTemplate: Instantiable0[MainTemplate],
    Module: Instantiable1[/* type */ String, Module],
    ModuleTemplate: Instantiable0[ModuleTemplate],
    NormalModuleFactory: Instantiable0[NormalModuleFactory_],
    Record: Instantiable0[Record],
    RuntimeTemplate: Instantiable0[RuntimeTemplate],
    normalModuleFactory: TypeofnormalModuleFactory
  ): Typeofcompilation = {
    val __obj = js.Dynamic.literal(Asset = Asset.asInstanceOf[js.Any], Chunk = Chunk.asInstanceOf[js.Any], ChunkGroup = ChunkGroup.asInstanceOf[js.Any], ChunkHash = ChunkHash.asInstanceOf[js.Any], ChunkTemplate = ChunkTemplate.asInstanceOf[js.Any], Compilation = Compilation.asInstanceOf[js.Any], ContextModuleFactory = ContextModuleFactory.asInstanceOf[js.Any], DependenciesBlock = DependenciesBlock.asInstanceOf[js.Any], Dependency = Dependency.asInstanceOf[js.Any], DllModuleFactory = DllModuleFactory.asInstanceOf[js.Any], HotUpdateChunkTemplate = HotUpdateChunkTemplate.asInstanceOf[js.Any], MainTemplate = MainTemplate.asInstanceOf[js.Any], Module = Module.asInstanceOf[js.Any], ModuleTemplate = ModuleTemplate.asInstanceOf[js.Any], NormalModuleFactory = NormalModuleFactory.asInstanceOf[js.Any], Record = Record.asInstanceOf[js.Any], RuntimeTemplate = RuntimeTemplate.asInstanceOf[js.Any], normalModuleFactory = normalModuleFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcompilation]
  }
  @scala.inline
  implicit class TypeofcompilationOps[Self <: Typeofcompilation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsset(value: Instantiable0[Asset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Asset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChunk(value: Instantiable0[Chunk]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Chunk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChunkGroup(value: Instantiable0[ChunkGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChunkGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChunkHash(value: Instantiable0[ChunkHash]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChunkHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChunkTemplate(value: Instantiable0[ChunkTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChunkTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompilation(value: Instantiable0[Compilation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Compilation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextModuleFactory(value: Instantiable0[ContextModuleFactory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContextModuleFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependenciesBlock(value: Instantiable0[DependenciesBlock]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DependenciesBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDependency(value: TypeofDependency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dependency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDllModuleFactory(value: Instantiable0[DllModuleFactory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DllModuleFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHotUpdateChunkTemplate(value: Instantiable0[HotUpdateChunkTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HotUpdateChunkTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMainTemplate(value: Instantiable0[MainTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MainTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModule(value: Instantiable1[/* type */ String, Module]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Module")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleTemplate(value: Instantiable0[ModuleTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModuleTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalModuleFactory(value: Instantiable0[NormalModuleFactory_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NormalModuleFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecord(value: Instantiable0[Record]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Record")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuntimeTemplate(value: Instantiable0[RuntimeTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuntimeTemplate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

