package typingsSlinky.superagent

import typingsSlinky.node.Buffer
import typingsSlinky.superagent.superagentStrings.auto
import typingsSlinky.superagent.superagentStrings.basic
import typingsSlinky.superagent.superagentStrings.bearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var `type`: bearer = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(`type`: bearer): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: bearer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ContentType extends StObject {
    
    var contentType: js.UndefOr[String] = js.native
    
    var filename: js.UndefOr[String] = js.native
  }
  object ContentType {
    
    @scala.inline
    def apply(): ContentType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentType]
    }
    
    @scala.inline
    implicit class ContentTypeMutableBuilder[Self <: ContentType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  @js.native
  trait Deadline extends StObject {
    
    var deadline: js.UndefOr[Double] = js.native
    
    var response: js.UndefOr[Double] = js.native
  }
  object Deadline {
    
    @scala.inline
    def apply(): Deadline = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Deadline]
    }
    
    @scala.inline
    implicit class DeadlineMutableBuilder[Self <: Deadline] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeadline(value: Double): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeadlineUndefined: Self = StObject.set(x, "deadline", js.undefined)
      
      @scala.inline
      def setResponse(value: Double): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
  
  @js.native
  trait Passphrase extends StObject {
    
    var passphrase: String = js.native
    
    var pfx: String | Buffer = js.native
  }
  object Passphrase {
    
    @scala.inline
    def apply(passphrase: String, pfx: String | Buffer): Passphrase = {
      val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], pfx = pfx.asInstanceOf[js.Any])
      __obj.asInstanceOf[Passphrase]
    }
    
    @scala.inline
    implicit class PassphraseMutableBuilder[Self <: Passphrase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfx(value: String | Buffer): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var `type`: basic | auto = js.native
  }
  object Type {
    
    @scala.inline
    def apply(`type`: basic | auto): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: basic | auto): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
