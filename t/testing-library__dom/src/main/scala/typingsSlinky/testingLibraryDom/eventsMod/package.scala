package typingsSlinky.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object eventsMod {
  
  type CreateFunction = js.Function4[
    /* eventName */ typingsSlinky.testingLibraryDom.eventsMod.EventType, 
    /* node */ org.scalajs.dom.raw.Document | org.scalajs.dom.raw.Element | org.scalajs.dom.raw.Window | org.scalajs.dom.raw.Node, 
    /* init */ js.UndefOr[js.Object], 
    /* options */ js.UndefOr[typingsSlinky.testingLibraryDom.anon.DefaultInit], 
    org.scalajs.dom.raw.Event
  ]
  
  type FireFunction = js.Function2[
    /* element */ org.scalajs.dom.raw.Document | org.scalajs.dom.raw.Element | org.scalajs.dom.raw.Window | org.scalajs.dom.raw.Node, 
    /* event */ org.scalajs.dom.raw.Event, 
    scala.Boolean
  ]
}
