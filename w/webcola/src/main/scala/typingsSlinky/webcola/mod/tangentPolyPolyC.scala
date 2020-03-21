package typingsSlinky.webcola.mod

import typingsSlinky.webcola.AnonT1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "tangent_PolyPolyC")
@js.native
object tangentPolyPolyC extends js.Object {
  def apply(
    V: js.Array[typingsSlinky.webcola.geomMod.Point],
    W: js.Array[typingsSlinky.webcola.geomMod.Point],
    t1: js.Function2[
      /* a */ typingsSlinky.webcola.geomMod.Point, 
      /* b */ js.Array[typingsSlinky.webcola.geomMod.Point], 
      Double
    ],
    t2: js.Function2[
      /* a */ typingsSlinky.webcola.geomMod.Point, 
      /* b */ js.Array[typingsSlinky.webcola.geomMod.Point], 
      Double
    ],
    cmp1: js.Function3[
      /* a */ typingsSlinky.webcola.geomMod.Point, 
      /* b */ typingsSlinky.webcola.geomMod.Point, 
      /* c */ typingsSlinky.webcola.geomMod.Point, 
      Boolean
    ],
    cmp2: js.Function3[
      /* a */ typingsSlinky.webcola.geomMod.Point, 
      /* b */ typingsSlinky.webcola.geomMod.Point, 
      /* c */ typingsSlinky.webcola.geomMod.Point, 
      Boolean
    ]
  ): AnonT1 = js.native
}

