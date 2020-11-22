package typingsSlinky.tsJest

import typingsSlinky.tsJest.configSetMod.ConfigSet
import typingsSlinky.typescript.mod.SourceFile
import typingsSlinky.typescript.mod.TransformationContext
import typingsSlinky.typescript.mod.Transformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-jest/dist/transformers/path-mapping", JSImport.Namespace)
@js.native
object pathMappingMod extends js.Object {
  
  def factory(cs: ConfigSet): js.Function1[/* ctx */ TransformationContext, Transformer[SourceFile]] = js.native
}
