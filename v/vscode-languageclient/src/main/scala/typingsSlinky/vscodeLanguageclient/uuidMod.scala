package typingsSlinky.vscodeLanguageclient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uuidMod {
  
  @JSImport("vscode-languageclient/lib/utils/uuid", "empty")
  @js.native
  val empty: UUID = js.native
  
  @JSImport("vscode-languageclient/lib/utils/uuid", "generateUuid")
  @js.native
  def generateUuid(): String = js.native
  
  @JSImport("vscode-languageclient/lib/utils/uuid", "isUUID")
  @js.native
  def isUUID(value: String): Boolean = js.native
  
  @JSImport("vscode-languageclient/lib/utils/uuid", "parse")
  @js.native
  def parse(value: String): UUID = js.native
  
  @JSImport("vscode-languageclient/lib/utils/uuid", "v4")
  @js.native
  def v4(): UUID = js.native
  
  @js.native
  trait UUID extends StObject {
    
    /**
      * @returns the canonical representation in sets of hexadecimal numbers separated by dashes.
      */
    def asHex(): String = js.native
    
    def equals(other: UUID): Boolean = js.native
  }
  object UUID {
    
    @scala.inline
    def apply(asHex: () => String, equals_ : UUID => Boolean): UUID = {
      val __obj = js.Dynamic.literal(asHex = js.Any.fromFunction0(asHex))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[UUID]
    }
    
    @scala.inline
    implicit class UUIDMutableBuilder[Self <: UUID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsHex(value: () => String): Self = StObject.set(x, "asHex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEquals_(value: UUID => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    }
  }
}
