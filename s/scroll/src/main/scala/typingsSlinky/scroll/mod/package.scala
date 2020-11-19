package typingsSlinky.scroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Cancel = js.Function0[scala.Unit]
  
  type Scroll = js.Function4[
    /* el */ org.scalajs.dom.raw.HTMLElement, 
    /* to */ scala.Double, 
    /* opts */ js.UndefOr[typingsSlinky.scroll.mod.ScrollOptions | typingsSlinky.scroll.mod.ScrollCallback], 
    /* cb */ js.UndefOr[typingsSlinky.scroll.mod.ScrollCallback], 
    typingsSlinky.scroll.mod.Cancel
  ]
  
  type ScrollCallback = js.Function2[
    /* error */ typingsSlinky.scroll.mod.ScrollError, 
    /* value */ scala.Double, 
    scala.Unit
  ]
  
  type ScrollError = js.Error | scala.Null
}
