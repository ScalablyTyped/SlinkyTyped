package typingsSlinky.soap.elementsMod

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.soap.typesMod.IWsdlBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("soap/lib/wsdl/elements", "ElementElement")
@js.native
class ElementElement () extends Element {
  
  @JSName("$lookupType")
  var $lookupType: js.UndefOr[String] = js.native
  
  @JSName("$lookupTypes")
  var $lookupTypes: js.UndefOr[js.Array[_]] = js.native
  
  @JSName("$maxOccurs")
  var $maxOccurs: js.UndefOr[String] = js.native
  
  @JSName("$minOccurs")
  var $minOccurs: js.UndefOr[String] = js.native
  
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  
  @JSName("$type")
  var $type: js.UndefOr[String] = js.native
  
  @JSName("allowedChildren")
  val allowedChildren_ElementElement: StringDictionary[
    Instantiable4[
      /* nsName */ String, 
      /* attrs */ js.Any, 
      /* options */ js.UndefOr[IWsdlBaseOptions], 
      /* schemaAttrs */ js.UndefOr[js.Any], 
      Element
    ]
  ] = js.native
  
  var targetNSAlias: js.UndefOr[String] = js.native
  
  var targetNamespace: js.UndefOr[String] = js.native
}
