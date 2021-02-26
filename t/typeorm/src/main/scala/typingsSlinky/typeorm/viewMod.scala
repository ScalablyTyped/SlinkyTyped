package typingsSlinky.typeorm

import typingsSlinky.typeorm.browserMod.Connection
import typingsSlinky.typeorm.browserMod.EntityMetadata
import typingsSlinky.typeorm.browserMod.SelectQueryBuilder
import typingsSlinky.typeorm.driverMod.Driver
import typingsSlinky.typeorm.viewOptionsMod.ViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewMod {
  
  @JSImport("typeorm/browser/schema-builder/view/View", "View")
  @js.native
  class View () extends StObject {
    def this(options: ViewOptions) = this()
    
    /**
      * View definition.
      */
    var expression: String | (js.Function1[/* connection */ Connection, SelectQueryBuilder[_]]) = js.native
    
    /**
      * Indicates if view is materialized.
      */
    var materialized: Boolean = js.native
    
    /**
      * Contains database name, schema name and table name.
      * E.g. "myDB"."mySchema"."myTable"
      */
    var name: String = js.native
  }
  /* static members */
  object View {
    
    /**
      * Creates view from a given entity metadata.
      */
    @JSImport("typeorm/browser/schema-builder/view/View", "View.create")
    @js.native
    def create(entityMetadata: EntityMetadata, driver: Driver): View = js.native
  }
}
