package typingsSlinky.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeParserType[T] extends StObject {
  
  /**
    * Value of "pg_type"."typname" (e.g. "int8", "timestamp", "timestamptz")
    */
  var name: String = js.native
  
  def parse(value: String): T = js.native
}
object TypeParserType {
  
  @scala.inline
  def apply[T](name: String, parse: String => T): TypeParserType[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[TypeParserType[T]]
  }
  
  @scala.inline
  implicit class TypeParserTypeMutableBuilder[Self <: TypeParserType[_], T] (val x: Self with TypeParserType[T]) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: String => T): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
  }
}
