package typingsSlinky.typeorm

import typingsSlinky.typeorm.anon.Master
import typingsSlinky.typeorm.baseConnectionOptionsMod.BaseConnectionOptions
import typingsSlinky.typeorm.cockroachConnectionCredentialsOptionsMod.CockroachConnectionCredentialsOptions
import typingsSlinky.typeorm.connectionOptionsMod.ConnectionOptions
import typingsSlinky.typeorm.typeormStrings.cockroachdb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cockroachConnectionOptionsMod {
  
  @js.native
  trait CockroachConnectionOptions
    extends BaseConnectionOptions
       with CockroachConnectionCredentialsOptions
       with ConnectionOptions {
    
    val poolErrorHandler: js.UndefOr[js.Function1[/* err */ js.Any, _]] = js.native
    
    /**
      * Replication setup.
      */
    val replication: js.UndefOr[Master] = js.native
    
    /**
      * Schema name.
      */
    val schema: js.UndefOr[String] = js.native
    
    /**
      * Database type.
      */
    @JSName("type")
    val type_CockroachConnectionOptions: cockroachdb = js.native
  }
  object CockroachConnectionOptions {
    
    @scala.inline
    def apply(`type`: cockroachdb): CockroachConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CockroachConnectionOptions]
    }
    
    @scala.inline
    implicit class CockroachConnectionOptionsMutableBuilder[Self <: CockroachConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPoolErrorHandler(value: /* err */ js.Any => _): Self = StObject.set(x, "poolErrorHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPoolErrorHandlerUndefined: Self = StObject.set(x, "poolErrorHandler", js.undefined)
      
      @scala.inline
      def setReplication(value: Master): Self = StObject.set(x, "replication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationUndefined: Self = StObject.set(x, "replication", js.undefined)
      
      @scala.inline
      def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setType(value: cockroachdb): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
