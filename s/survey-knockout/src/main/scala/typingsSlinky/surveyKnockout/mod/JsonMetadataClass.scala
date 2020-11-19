package typingsSlinky.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "JsonMetadataClass")
@js.native
class JsonMetadataClass protected () extends js.Object {
  def this(name: String, properties: js.Array[_]) = this()
  def this(name: String, properties: js.Array[_], creator: js.Function1[/* json */ js.UndefOr[js.Any], _]) = this()
  def this(name: String, properties: js.Array[_], creator: js.UndefOr[scala.Nothing], parentName: String) = this()
  def this(
    name: String,
    properties: js.Array[_],
    creator: js.Function1[/* json */ js.UndefOr[js.Any], _],
    parentName: String
  ) = this()
  
  def createProperty(propInfo: js.Any): JsonObjectProperty = js.native
  
  def creator(): js.Any = js.native
  def creator(json: js.Any): js.Any = js.native
  
  def find(name: String): JsonObjectProperty = js.native
  
  var name: String = js.native
  
  var parentName: String = js.native
  
  var properties: js.Array[JsonObjectProperty] = js.native
}
/* static members */
@JSImport("survey-knockout", "JsonMetadataClass")
@js.native
object JsonMetadataClass extends js.Object {
  
  var requiredSymbol: String = js.native
  
  var typeSymbol: String = js.native
}
