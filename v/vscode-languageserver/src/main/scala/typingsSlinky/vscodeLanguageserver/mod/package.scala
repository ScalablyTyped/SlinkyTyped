package typingsSlinky.vscodeLanguageserver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ClientFeature[P] = typingsSlinky.vscodeLanguageserver.mod.Feature[typingsSlinky.vscodeLanguageserver.mod.RemoteClient, P]
  type ConsoleFeature[P] = typingsSlinky.vscodeLanguageserver.mod.Feature[typingsSlinky.vscodeLanguageserver.mod.RemoteConsole, P]
  type Feature[B, P] = js.Function1[
    /* Base */ org.scalablytyped.runtime.Instantiable0[B], 
    org.scalablytyped.runtime.Instantiable0[B with P]
  ]
  type IConnection = typingsSlinky.vscodeLanguageserver.mod.Connection[
    typingsSlinky.vscodeLanguageserver.mod._underscore, 
    typingsSlinky.vscodeLanguageserver.mod._underscore, 
    typingsSlinky.vscodeLanguageserver.mod._underscore, 
    typingsSlinky.vscodeLanguageserver.mod._underscore, 
    typingsSlinky.vscodeLanguageserver.mod._underscore, 
    typingsSlinky.vscodeLanguageserver.mod._underscore
  ]
  type RemoteWorkspace = typingsSlinky.vscodeLanguageserver.mod._RemoteWorkspace with typingsSlinky.vscodeLanguageserver.configurationMod.Configuration with typingsSlinky.vscodeLanguageserver.workspaceFoldersMod.WorkspaceFolders
  type TelemetryFeature[P] = typingsSlinky.vscodeLanguageserver.mod.Feature[typingsSlinky.vscodeLanguageserver.mod.Telemetry, P]
  type TracerFeature[P] = typingsSlinky.vscodeLanguageserver.mod.Feature[typingsSlinky.vscodeJsonrpc.mod.Tracer, P]
  type WindowFeature[P] = typingsSlinky.vscodeLanguageserver.mod.Feature[typingsSlinky.vscodeLanguageserver.mod.RemoteWindow, P]
  type WorkspaceFeature[P] = typingsSlinky.vscodeLanguageserver.mod.Feature[typingsSlinky.vscodeLanguageserver.mod.RemoteWorkspace, P]
}
