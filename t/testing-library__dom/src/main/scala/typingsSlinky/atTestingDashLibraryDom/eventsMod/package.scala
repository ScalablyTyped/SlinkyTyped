package typingsSlinky.atTestingDashLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventsMod {
  import org.scalajs.dom.raw.Document
  import org.scalajs.dom.raw.Element
  import org.scalajs.dom.raw.Event
  import org.scalajs.dom.raw.Window

  type CreateObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in @testing-library/dom.@testing-library/dom/events.EventType ]: (element : std.Document | std.Element | std.Window, options? : {}): std.Event}
    */ typingsSlinky.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.CreateObject with js.Any
  type FireFunction = js.Function2[/* element */ Document | Element | Window, /* event */ Event, Boolean]
  type FireObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in @testing-library/dom.@testing-library/dom/events.EventType ]: (element : std.Document | std.Element | std.Window, options? : {}): boolean}
    */ typingsSlinky.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.FireObject with js.Any
}
