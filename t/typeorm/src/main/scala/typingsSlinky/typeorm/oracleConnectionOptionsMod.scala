package typingsSlinky.typeorm

import typingsSlinky.typeorm.anon.Slaves
import typingsSlinky.typeorm.baseConnectionOptionsMod.BaseConnectionOptions
import typingsSlinky.typeorm.connectionOptionsMod.ConnectionOptions
import typingsSlinky.typeorm.oracleConnectionCredentialsOptionsMod.OracleConnectionCredentialsOptions
import typingsSlinky.typeorm.typeormStrings.oracle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oracleConnectionOptionsMod {
  
  @js.native
  trait OracleConnectionOptions
    extends BaseConnectionOptions
       with OracleConnectionCredentialsOptions
       with ConnectionOptions {
    
    /**
      * Replication setup.
      */
    val replication: js.UndefOr[Slaves] = js.native
    
    /**
      * Schema name. By default is "public".
      */
    val schema: js.UndefOr[String] = js.native
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_OracleConnectionOptions: oracle = js.native
  }
  object OracleConnectionOptions {
    
    @scala.inline
    def apply(`type`: oracle): OracleConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OracleConnectionOptions]
    }
    
    @scala.inline
    implicit class OracleConnectionOptionsMutableBuilder[Self <: OracleConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplication(value: Slaves): Self = StObject.set(x, "replication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationUndefined: Self = StObject.set(x, "replication", js.undefined)
      
      @scala.inline
      def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setType(value: oracle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
