package typingsSlinky.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataArgsTransactionEntityMetadataArgsMod {
  
  @js.native
  trait TransactionEntityMetadataArgs extends StObject {
    
    /**
      * Index of the parameter on which decorator is used.
      */
    val index: Double = js.native
    
    /**
      * Method on which decorator is used.
      */
    val methodName: String = js.native
    
    /**
      * Target class on which decorator is used.
      */
    val target: js.Function = js.native
  }
  object TransactionEntityMetadataArgs {
    
    @scala.inline
    def apply(index: Double, methodName: String, target: js.Function): TransactionEntityMetadataArgs = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionEntityMetadataArgs]
    }
    
    @scala.inline
    implicit class TransactionEntityMetadataArgsMutableBuilder[Self <: TransactionEntityMetadataArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: js.Function): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
