package typingsSlinky.typeorm

import typingsSlinky.typeorm.anon.CheckInterval
import typingsSlinky.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typingsSlinky.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typingsSlinky.typeorm.sapSapConnectionCredentialsOptionsMod.SapConnectionCredentialsOptions
import typingsSlinky.typeorm.typeormStrings.sap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapSapConnectionOptionsMod {
  
  @js.native
  trait SapConnectionOptions
    extends BaseConnectionOptions
       with SapConnectionCredentialsOptions
       with ConnectionOptions {
    
    /**
      * Pool options.
      */
    val pool: js.UndefOr[CheckInterval] = js.native
    
    /**
      * Database schema.
      */
    val schema: js.UndefOr[String] = js.native
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_SapConnectionOptions: sap = js.native
  }
  object SapConnectionOptions {
    
    @scala.inline
    def apply(`type`: sap): SapConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SapConnectionOptions]
    }
    
    @scala.inline
    implicit class SapConnectionOptionsMutableBuilder[Self <: SapConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPool(value: CheckInterval): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
      
      @scala.inline
      def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setType(value: sap): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
