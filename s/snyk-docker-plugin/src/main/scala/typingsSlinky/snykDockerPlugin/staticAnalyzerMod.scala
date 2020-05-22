package typingsSlinky.snykDockerPlugin

import typingsSlinky.snykDockerPlugin.analyzerTypesMod.StaticAnalysis
import typingsSlinky.snykDockerPlugin.distTypesMod.StaticAnalysisOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/analyzer/static-analyzer", JSImport.Namespace)
@js.native
object staticAnalyzerMod extends js.Object {
  def analyze(targetImage: String, options: StaticAnalysisOptions): js.Promise[StaticAnalysis] = js.native
}

