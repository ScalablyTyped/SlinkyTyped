package typingsSlinky.tabris.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.tabris.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "fetch")
@js.native
object fetch
  extends TopLevel[
      js.Function2[
        /* url */ String | typingsSlinky.tabris.Request, 
        /* init */ js.UndefOr[RequestInit], 
        js.Promise[typingsSlinky.tabris.Response]
      ]
    ]

