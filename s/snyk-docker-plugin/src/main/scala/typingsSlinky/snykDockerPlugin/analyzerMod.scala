package typingsSlinky.snykDockerPlugin

import typingsSlinky.snykDockerPlugin.analyzerTypesMod.DynamicAnalysis
import typingsSlinky.snykDockerPlugin.analyzerTypesMod.StaticAnalysis
import typingsSlinky.snykDockerPlugin.distDockerMod.DockerOptions
import typingsSlinky.snykDockerPlugin.distTypesMod.StaticAnalysisOptions
import typingsSlinky.snykDockerPlugin.dockerFileMod.DockerFileAnalysis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/analyzer", JSImport.Namespace)
@js.native
object analyzerMod extends js.Object {
  def analyzeDynamically(targetImage: String): js.Promise[DynamicAnalysis] = js.native
  def analyzeDynamically(targetImage: String, dockerfileAnalysis: DockerFileAnalysis): js.Promise[DynamicAnalysis] = js.native
  def analyzeDynamically(targetImage: String, dockerfileAnalysis: DockerFileAnalysis, options: DockerOptions): js.Promise[DynamicAnalysis] = js.native
  def analyzeStatically(targetImage: String, options: StaticAnalysisOptions): js.Promise[StaticAnalysis] = js.native
}

