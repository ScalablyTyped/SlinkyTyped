package typingsSlinky.uws

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.uws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var target: this.type = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(target: `0`): `0` = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: `0`): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Binary extends StObject {
    
    var binary: js.UndefOr[Boolean] = js.native
    
    var mask: js.UndefOr[Boolean] = js.native
  }
  object Binary {
    
    @scala.inline
    def apply(): Binary = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Binary]
    }
    
    @scala.inline
    implicit class BinaryMutableBuilder[Self <: Binary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      @scala.inline
      def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    }
  }
  
  @js.native
  trait BinaryBoolean extends StObject {
    
    var binary: Boolean = js.native
  }
  object BinaryBoolean {
    
    @scala.inline
    def apply(binary: Boolean): BinaryBoolean = {
      val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinaryBoolean]
    }
    
    @scala.inline
    implicit class BinaryBooleanMutableBuilder[Self <: BinaryBoolean] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Code extends StObject {
    
    var code: Double = js.native
    
    var reason: String = js.native
    
    var target: WebSocket = js.native
    
    var wasClean: Boolean = js.native
  }
  object Code {
    
    @scala.inline
    def apply(code: Double, reason: String, target: WebSocket, wasClean: Boolean): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], wasClean = wasClean.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: WebSocket): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWasClean(value: Boolean): Self = StObject.set(x, "wasClean", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Data extends StObject {
    
    var data: js.Any = js.native
    
    var target: WebSocket = js.native
    
    var `type`: String = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: js.Any, target: WebSocket, `type`: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: WebSocket): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Origin extends StObject {
    
    var origin: String = js.native
    
    var req: IncomingMessage = js.native
    
    var secure: Boolean = js.native
  }
  object Origin {
    
    @scala.inline
    def apply(origin: String, req: IncomingMessage, secure: Boolean): Origin = {
      val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
      __obj.asInstanceOf[Origin]
    }
    
    @scala.inline
    implicit class OriginMutableBuilder[Self <: Origin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Reason extends StObject {
    
    var code: Double = js.native
    
    var reason: String = js.native
    
    var target: this.type = js.native
    
    var wasClean: Boolean = js.native
  }
  object Reason {
    
    @scala.inline
    def apply(code: Double, reason: String, target: Reason, wasClean: Boolean): Reason = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], wasClean = wasClean.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reason]
    }
    
    @scala.inline
    implicit class ReasonMutableBuilder[Self <: Reason] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: Reason): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWasClean(value: Boolean): Self = StObject.set(x, "wasClean", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Target extends StObject {
    
    var target: WebSocket = js.native
  }
  object Target {
    
    @scala.inline
    def apply(target: WebSocket): Target = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: WebSocket): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var data: js.Any = js.native
    
    var target: this.type = js.native
    
    var `type`: String = js.native
  }
  object Type {
    
    @scala.inline
    def apply(data: js.Any, target: Type, `type`: String): Type = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: Type): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
