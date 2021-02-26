package typingsSlinky.socketclusterServer

import typingsSlinky.ws.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Algorithm extends StObject {
    
    var algorithm: js.UndefOr[String] = js.native
    
    var expiresIn: Double = js.native
  }
  object Algorithm {
    
    @scala.inline
    def apply(expiresIn: Double): Algorithm = {
      val __obj = js.Dynamic.literal(expiresIn = expiresIn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Algorithm]
    }
    
    @scala.inline
    implicit class AlgorithmMutableBuilder[Self <: Algorithm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Algorithms extends StObject {
    
    var algorithms: js.UndefOr[js.Array[String]] = js.native
  }
  object Algorithms {
    
    @scala.inline
    def apply(): Algorithms = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Algorithms]
    }
    
    @scala.inline
    implicit class AlgorithmsMutableBuilder[Self <: Algorithms] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
      
      @scala.inline
      def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Binary extends StObject {
    
    var binary: js.UndefOr[Boolean] = js.native
    
    var compress: js.UndefOr[Boolean] = js.native
    
    var fin: js.UndefOr[Boolean] = js.native
    
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
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setFin(value: Boolean): Self = StObject.set(x, "fin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinUndefined: Self = StObject.set(x, "fin", js.undefined)
      
      @scala.inline
      def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    }
  }
  
  @js.native
  trait Data extends StObject {
    
    var data: js.Any = js.native
    
    var target: ^ = js.native
    
    var `type`: String = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: js.Any, target: ^, `type`: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: ^): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Error extends StObject {
    
    var error: js.Error = js.native
  }
  object Error {
    
    @scala.inline
    def apply(error: js.Error): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Message extends StObject {
    
    var message: Data = js.native
  }
  object Message {
    
    @scala.inline
    def apply(message: Data): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: Data): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RejectOnFailedDelivery extends StObject {
    
    var rejectOnFailedDelivery: Boolean = js.native
  }
  object RejectOnFailedDelivery {
    
    @scala.inline
    def apply(rejectOnFailedDelivery: Boolean): RejectOnFailedDelivery = {
      val __obj = js.Dynamic.literal(rejectOnFailedDelivery = rejectOnFailedDelivery.asInstanceOf[js.Any])
      __obj.asInstanceOf[RejectOnFailedDelivery]
    }
    
    @scala.inline
    implicit class RejectOnFailedDeliveryMutableBuilder[Self <: RejectOnFailedDelivery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRejectOnFailedDelivery(value: Boolean): Self = StObject.set(x, "rejectOnFailedDelivery", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SignedAuthToken extends StObject {
    
    var signedAuthToken: String = js.native
  }
  object SignedAuthToken {
    
    @scala.inline
    def apply(signedAuthToken: String): SignedAuthToken = {
      val __obj = js.Dynamic.literal(signedAuthToken = signedAuthToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignedAuthToken]
    }
    
    @scala.inline
    implicit class SignedAuthTokenMutableBuilder[Self <: SignedAuthToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignedAuthToken(value: String): Self = StObject.set(x, "signedAuthToken", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Socket extends StObject {
    
    var socket: typingsSlinky.socketclusterServer.serversocketMod.^ = js.native
  }
  object Socket {
    
    @scala.inline
    def apply(socket: typingsSlinky.socketclusterServer.serversocketMod.^): Socket = {
      val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[Socket]
    }
    
    @scala.inline
    implicit class SocketMutableBuilder[Self <: Socket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSocket(value: typingsSlinky.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Warning extends StObject {
    
    var warning: js.Error = js.native
  }
  object Warning {
    
    @scala.inline
    def apply(warning: js.Error): Warning = {
      val __obj = js.Dynamic.literal(warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[Warning]
    }
    
    @scala.inline
    implicit class WarningMutableBuilder[Self <: Warning] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWarning(value: js.Error): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
}
