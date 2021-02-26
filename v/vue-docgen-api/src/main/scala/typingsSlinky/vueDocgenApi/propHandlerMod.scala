package typingsSlinky.vueDocgenApi

import typingsSlinky.astTypes.nodePathMod.NodePath
import typingsSlinky.babelTypes.mod.ObjectMethod_
import typingsSlinky.babelTypes.mod.ObjectProperty_
import typingsSlinky.babelTypes.mod.TSType
import typingsSlinky.vueInbrowserCompilerUtils.typesMod.PropDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propHandlerMod {
  
  @JSImport("vue-docgen-api/dist/script-handlers/propHandler", JSImport.Default)
  @js.native
  def default(documentation: typingsSlinky.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers/propHandler", "describeDefault")
  @js.native
  def describeDefault(
    propPropertiesPath: js.Array[NodePath[ObjectProperty_ | ObjectMethod_, _]],
    propDescriptor: PropDescriptor,
    propType: String
  ): Unit = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers/propHandler", "describeRequired")
  @js.native
  def describeRequired(
    propPropertiesPath: js.Array[NodePath[ObjectProperty_ | ObjectMethod_, _]],
    propDescriptor: PropDescriptor
  ): Unit = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers/propHandler", "describeType")
  @js.native
  def describeType(
    propPropertiesPath: js.Array[NodePath[ObjectProperty_ | ObjectMethod_, _]],
    propDescriptor: PropDescriptor
  ): js.UndefOr[String] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers/propHandler", "extractValuesFromTags")
  @js.native
  def extractValuesFromTags(propDescriptor: PropDescriptor): Unit = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers/propHandler", "getValuesFromTypeAnnotation")
  @js.native
  def getValuesFromTypeAnnotation(`type`: TSType): js.UndefOr[js.Array[String]] = js.native
}
