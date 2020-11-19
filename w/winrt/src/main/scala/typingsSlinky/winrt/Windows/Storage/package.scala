package typingsSlinky.winrt.Windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Storage {
  
  type ApplicationDataSetVersionHandler = js.Function1[
    /* setVersionRequest */ typingsSlinky.winrt.Windows.Storage.SetVersionRequest, 
    scala.Unit
  ]
  
  type StreamedFileDataRequestedHandler = js.Function1[
    /* stream */ typingsSlinky.winrt.Windows.Storage.StreamedFileDataRequest, 
    scala.Unit
  ]
}
