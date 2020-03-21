package typingsSlinky.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object viewViewMod {
  type ViewConfigFactory = js.Function2[
    /* path */ js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode], 
    /* decl */ typingsSlinky.uirouterCore.stateInterfaceMod.ViewDeclaration, 
    typingsSlinky.uirouterCore.viewInterfaceMod.ViewConfig | js.Array[typingsSlinky.uirouterCore.viewInterfaceMod.ViewConfig]
  ]
  type ViewSyncListener = js.Function1[
    /* viewTuples */ js.Array[typingsSlinky.uirouterCore.viewViewMod.ViewTuple], 
    scala.Unit
  ]
}
