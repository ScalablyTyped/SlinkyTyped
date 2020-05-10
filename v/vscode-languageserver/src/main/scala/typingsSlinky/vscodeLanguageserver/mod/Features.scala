package typingsSlinky.vscodeLanguageserver.mod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.vscodeLanguageserver.vscodeLanguageserverStrings.features
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] extends js.Object {
  var __brand: features = js.native
  var client: js.UndefOr[ClientFeature[PClient]] = js.native
  var console: js.UndefOr[ConsoleFeature[PConsole]] = js.native
  var telemetry: js.UndefOr[TelemetryFeature[PTelemetry]] = js.native
  var tracer: js.UndefOr[TracerFeature[PTracer]] = js.native
  var window: js.UndefOr[WindowFeature[PWindow]] = js.native
  var workspace: js.UndefOr[WorkspaceFeature[PWorkspace]] = js.native
}

object Features {
  @scala.inline
  def apply[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace](__brand: features): Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = {
    val __obj = js.Dynamic.literal(__brand = __brand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace]]
  }
  @scala.inline
  implicit class FeaturesOps[Self[pconsole, ptracer, ptelemetry, pclient, pwindow, pworkspace] <: Features[pconsole, ptracer, ptelemetry, pclient, pwindow, pworkspace], PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] (val x: Self[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace]) extends AnyVal {
    @scala.inline
    def duplicate: Self[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace]) with Other]
    @scala.inline
    def with__brand(value: features): Self[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient(value: /* Base */ Instantiable0[RemoteClient] => Instantiable0[RemoteClient with PClient]): Self[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClient: Self[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withConsole(value: /* Base */ Instantiable0[RemoteConsole] => Instantiable0[RemoteConsole with PConsole]): Self[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutConsole: Self[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(js.undefined)
        ret
    }
    @scala.inline
    def withTelemetry(value: /* Base */ Instantiable0[Telemetry] => Instantiable0[Telemetry with PTelemetry]): Self[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telemetry")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTelemetry: Self[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telemetry")(js.undefined)
        ret
    }
    @scala.inline
    def withTracer(value: /* Base */ Instantiable0[Tracer] => Instantiable0[Tracer with PTracer]): Self[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTracer: Self[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracer")(js.undefined)
        ret
    }
    @scala.inline
    def withWindow(value: /* Base */ Instantiable0[RemoteWindow] => Instantiable0[RemoteWindow with PWindow]): Self[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWindow: Self[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("window")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspace(value: /* Base */ Instantiable0[RemoteWorkspace] => Instantiable0[RemoteWorkspace with PWorkspace]): Self[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspace")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWorkspace: Self[PConsole, PTracer, PTelemetry, PClient, PWindow, PWorkspace] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspace")(js.undefined)
        ret
    }
  }
  
}

