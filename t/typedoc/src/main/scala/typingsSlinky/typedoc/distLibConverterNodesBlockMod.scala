package typingsSlinky.typedoc

import typingsSlinky.typedoc.distLibConverterComponentsMod.ConverterNodeComponent
import typingsSlinky.typedoc.distLibConverterContextMod.Context
import typingsSlinky.typedoc.distLibConverterNodesBlockMod.SourceFileMode
import typingsSlinky.typedoc.distLibModelsMod.Reflection
import typingsSlinky.typescript.typescriptMod.Block
import typingsSlinky.typescript.typescriptMod.ModuleBlock
import typingsSlinky.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/block", JSImport.Namespace)
@js.native
object distLibConverterNodesBlockMod extends js.Object {
  @js.native
  class BlockConverter () extends ConverterNodeComponent[SourceFile | Block | ModuleBlock] {
    var convertSourceFile: js.Any = js.native
    var convertStatements: js.Any = js.native
    var mode: SourceFileMode = js.native
    def convert(context: Context, node: Block): Reflection = js.native
    def convert(context: Context, node: ModuleBlock): Reflection = js.native
    def convert(context: Context, node: SourceFile): Reflection = js.native
  }
  
  @js.native
  sealed trait SourceFileMode extends js.Object
  
  @js.native
  object SourceFileMode extends js.Object {
    @js.native
    sealed trait File extends SourceFileMode
    
    @js.native
    sealed trait Modules extends SourceFileMode
    
    /* 0 */ val File: typingsSlinky.typedoc.distLibConverterNodesBlockMod.SourceFileMode.File with Double = js.native
    /* 1 */ val Modules: typingsSlinky.typedoc.distLibConverterNodesBlockMod.SourceFileMode.Modules with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SourceFileMode with Double] = js.native
  }
  
}

