package typingsSlinky.webcola.webcolaMod

import typingsSlinky.webcola.Anon_T1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "tangent_PolyPolyC")
@js.native
object tangent_PolyPolyC extends js.Object {
  def apply(
    V: js.Array[typingsSlinky.webcola.distSrcGeomMod.Point],
    W: js.Array[typingsSlinky.webcola.distSrcGeomMod.Point],
    t1: js.Function2[
      /* a */ typingsSlinky.webcola.distSrcGeomMod.Point, 
      /* b */ js.Array[typingsSlinky.webcola.distSrcGeomMod.Point], 
      Double
    ],
    t2: js.Function2[
      /* a */ typingsSlinky.webcola.distSrcGeomMod.Point, 
      /* b */ js.Array[typingsSlinky.webcola.distSrcGeomMod.Point], 
      Double
    ],
    cmp1: js.Function3[
      /* a */ typingsSlinky.webcola.distSrcGeomMod.Point, 
      /* b */ typingsSlinky.webcola.distSrcGeomMod.Point, 
      /* c */ typingsSlinky.webcola.distSrcGeomMod.Point, 
      Boolean
    ],
    cmp2: js.Function3[
      /* a */ typingsSlinky.webcola.distSrcGeomMod.Point, 
      /* b */ typingsSlinky.webcola.distSrcGeomMod.Point, 
      /* c */ typingsSlinky.webcola.distSrcGeomMod.Point, 
      Boolean
    ]
  ): Anon_T1 = js.native
}

