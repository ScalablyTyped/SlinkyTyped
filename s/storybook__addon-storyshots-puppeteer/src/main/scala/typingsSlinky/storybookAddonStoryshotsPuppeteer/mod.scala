package typingsSlinky.storybookAddonStoryshotsPuppeteer

import typingsSlinky.storybookAddonStoryshotsPuppeteer.anon.AfterAll
import typingsSlinky.storybookAddonStoryshotsPuppeteer.anon.PartialCommonConfig
import typingsSlinky.storybookAddonStoryshotsPuppeteer.anon.PartialImageSnapshotConfi
import typingsSlinky.storybookAddonStoryshotsPuppeteer.anon.PartialPuppeteerTestConfi
import typingsSlinky.storybookAddonStoryshotsPuppeteer.configMod.CommonConfig
import typingsSlinky.storybookAddonStoryshotsPuppeteer.configMod.ImageSnapshotConfig
import typingsSlinky.storybookAddonStoryshotsPuppeteer.configMod.PuppeteerTestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-storyshots-puppeteer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val defaultCommonConfig: CommonConfig = js.native
  val defaultImageSnapshotConfig: ImageSnapshotConfig = js.native
  val defaultPuppeteerTestConfig: PuppeteerTestConfig = js.native
  def axeTest(): AfterAll = js.native
  def axeTest(customConfig: PartialCommonConfig): AfterAll = js.native
  def imageSnapshot(): AfterAll = js.native
  def imageSnapshot(customConfig: PartialImageSnapshotConfi): AfterAll = js.native
  def puppeteerTest(): AfterAll = js.native
  def puppeteerTest(customConfig: PartialPuppeteerTestConfi): AfterAll = js.native
}

