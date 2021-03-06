package typingsSlinky.storybookClientApi.typesMod

import typingsSlinky.std.Record
import typingsSlinky.storybookClientApi.storybookClientApiStrings.`object`
import typingsSlinky.storybookClientApi.storybookClientApiStrings.array
import typingsSlinky.storybookClientApi.storybookClientApiStrings.boolean
import typingsSlinky.storybookClientApi.storybookClientApiStrings.enum
import typingsSlinky.storybookClientApi.storybookClientApiStrings.function
import typingsSlinky.storybookClientApi.storybookClientApiStrings.intersection
import typingsSlinky.storybookClientApi.storybookClientApiStrings.number
import typingsSlinky.storybookClientApi.storybookClientApiStrings.other
import typingsSlinky.storybookClientApi.storybookClientApiStrings.string
import typingsSlinky.storybookClientApi.storybookClientApiStrings.union
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.storybookClientApi.typesMod.SBScalarType
  - typingsSlinky.storybookClientApi.typesMod.SBEnumType
  - typingsSlinky.storybookClientApi.typesMod.SBArrayType
  - typingsSlinky.storybookClientApi.typesMod.SBObjectType
  - typingsSlinky.storybookClientApi.typesMod.SBIntersectionType
  - typingsSlinky.storybookClientApi.typesMod.SBUnionType
  - typingsSlinky.storybookClientApi.typesMod.SBOtherType
*/
trait SBType extends StObject
object SBType {
  
  @scala.inline
  def SBArrayType(name: array, value: SBType): typingsSlinky.storybookClientApi.typesMod.SBArrayType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.storybookClientApi.typesMod.SBArrayType]
  }
  
  @scala.inline
  def SBEnumType(name: enum, value: js.Array[String | Double]): typingsSlinky.storybookClientApi.typesMod.SBEnumType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.storybookClientApi.typesMod.SBEnumType]
  }
  
  @scala.inline
  def SBIntersectionType(name: intersection, value: js.Array[SBType]): typingsSlinky.storybookClientApi.typesMod.SBIntersectionType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.storybookClientApi.typesMod.SBIntersectionType]
  }
  
  @scala.inline
  def SBObjectType(name: `object`, value: Record[String, SBType]): typingsSlinky.storybookClientApi.typesMod.SBObjectType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.storybookClientApi.typesMod.SBObjectType]
  }
  
  @scala.inline
  def SBOtherType(name: other, value: String): typingsSlinky.storybookClientApi.typesMod.SBOtherType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.storybookClientApi.typesMod.SBOtherType]
  }
  
  @scala.inline
  def SBScalarType(name: boolean | string | number | function): typingsSlinky.storybookClientApi.typesMod.SBScalarType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.storybookClientApi.typesMod.SBScalarType]
  }
  
  @scala.inline
  def SBUnionType(name: union, value: js.Array[SBType]): typingsSlinky.storybookClientApi.typesMod.SBUnionType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.storybookClientApi.typesMod.SBUnionType]
  }
}
