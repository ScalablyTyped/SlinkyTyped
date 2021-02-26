package typingsSlinky.winrtUwp.Windows

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Storage {
  
  /** Represents a method that handles the request to set the version of the application data in the application data store. */
  type ApplicationDataSetVersionHandler = js.Function1[
    /* setVersionRequest */ typingsSlinky.winrtUwp.Windows.Storage.SetVersionRequest, 
    scala.Unit
  ]
  
  /** Represents the method that will stream data into a StorageFile when that file is first accessed. */
  type StreamedFileDataRequestedHandler = js.Function1[
    /* stream */ typingsSlinky.winrtUwp.Windows.Storage.StreamedFileDataRequest, 
    scala.Unit
  ]
}
