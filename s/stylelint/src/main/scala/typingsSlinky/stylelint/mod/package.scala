package typingsSlinky.stylelint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Plugin = js.Function2[
    /* primaryOption */ js.Any, 
    /* secondaryOptions */ js.UndefOr[js.Object], 
    js.Function2[
      /* root */ typingsSlinky.postcss.mod.Root_, 
      /* result */ typingsSlinky.postcss.mod.Result, 
      scala.Unit | js.Thenable[scala.Unit]
    ]
  ]
}
