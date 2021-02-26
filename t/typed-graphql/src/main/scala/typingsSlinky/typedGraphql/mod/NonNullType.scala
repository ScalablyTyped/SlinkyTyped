package typingsSlinky.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonNullType
  extends Node
     with Type {
  
  var kind: String = js.native
  
  var loc: js.UndefOr[Location] = js.native
  
  var `type`: NamedType | ListType = js.native
}
object NonNullType {
  
  @scala.inline
  def apply(kind: String, `type`: NamedType | ListType): NonNullType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonNullType]
  }
  
  @scala.inline
  implicit class NonNullTypeMutableBuilder[Self <: NonNullType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setType(value: NamedType | ListType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
