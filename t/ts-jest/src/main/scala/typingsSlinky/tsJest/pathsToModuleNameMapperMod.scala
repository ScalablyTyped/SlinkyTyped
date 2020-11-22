package typingsSlinky.tsJest

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tsJest.anon.Prefix
import typingsSlinky.typescript.mod.MapLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-jest/dist/config/paths-to-module-name-mapper", JSImport.Namespace)
@js.native
object pathsToModuleNameMapperMod extends js.Object {
  
  def pathsToModuleNameMapper(mapping: MapLike[js.Array[String]]): JestPathMapping = js.native
  def pathsToModuleNameMapper(mapping: MapLike[js.Array[String]], hasPrefix: Prefix): JestPathMapping = js.native
  
  type JestPathMapping = js.UndefOr[StringDictionary[String | js.Array[String]]]
}
