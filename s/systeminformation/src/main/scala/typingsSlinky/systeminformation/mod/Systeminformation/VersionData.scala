package typingsSlinky.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionData extends js.Object {
  var docker: js.UndefOr[String] = js.native
  var dotnet: js.UndefOr[String] = js.native
  var gcc: js.UndefOr[String] = js.native
  var git: js.UndefOr[String] = js.native
  var grunt: js.UndefOr[String] = js.native
  var gulp: js.UndefOr[String] = js.native
  @JSName("java")
  var java_ : js.UndefOr[String] = js.native
  var kernel: js.UndefOr[String] = js.native
  var mongodb: js.UndefOr[String] = js.native
  var mysql: js.UndefOr[String] = js.native
  var nginx: js.UndefOr[String] = js.native
  var node: js.UndefOr[String] = js.native
  var npm: js.UndefOr[String] = js.native
  var openssl: js.UndefOr[String] = js.native
  var perl: js.UndefOr[String] = js.native
  var php: js.UndefOr[String] = js.native
  var pip: js.UndefOr[String] = js.native
  var pip3: js.UndefOr[String] = js.native
  var pm2: js.UndefOr[String] = js.native
  var postfix: js.UndefOr[String] = js.native
  var postgresql: js.UndefOr[String] = js.native
  var python: js.UndefOr[String] = js.native
  var python3: js.UndefOr[String] = js.native
  var redis: js.UndefOr[String] = js.native
  var systemOpenssl: js.UndefOr[String] = js.native
  var systemOpensslLib: js.UndefOr[String] = js.native
  var tsc: js.UndefOr[String] = js.native
  var v8: js.UndefOr[String] = js.native
  var virtualbox: js.UndefOr[String] = js.native
  var yarn: js.UndefOr[String] = js.native
}

object VersionData {
  @scala.inline
  def apply(): VersionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersionData]
  }
  @scala.inline
  implicit class VersionDataOps[Self <: VersionData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docker")(js.undefined)
        ret
    }
    @scala.inline
    def withDotnet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotnet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotnet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotnet")(js.undefined)
        ret
    }
    @scala.inline
    def withGcc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGcc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gcc")(js.undefined)
        ret
    }
    @scala.inline
    def withGit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("git")(js.undefined)
        ret
    }
    @scala.inline
    def withGrunt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grunt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrunt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grunt")(js.undefined)
        ret
    }
    @scala.inline
    def withGulp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gulp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGulp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gulp")(js.undefined)
        ret
    }
    @scala.inline
    def withJava_(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("java")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJava_ : Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("java")(js.undefined)
        ret
    }
    @scala.inline
    def withKernel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernel")(js.undefined)
        ret
    }
    @scala.inline
    def withMongodb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mongodb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMongodb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mongodb")(js.undefined)
        ret
    }
    @scala.inline
    def withMysql(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mysql")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMysql: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mysql")(js.undefined)
        ret
    }
    @scala.inline
    def withNginx(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nginx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNginx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nginx")(js.undefined)
        ret
    }
    @scala.inline
    def withNode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.undefined)
        ret
    }
    @scala.inline
    def withNpm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNpm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npm")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenssl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenssl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openssl")(js.undefined)
        ret
    }
    @scala.inline
    def withPerl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perl")(js.undefined)
        ret
    }
    @scala.inline
    def withPhp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("php")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("php")(js.undefined)
        ret
    }
    @scala.inline
    def withPip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pip")(js.undefined)
        ret
    }
    @scala.inline
    def withPip3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pip3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPip3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pip3")(js.undefined)
        ret
    }
    @scala.inline
    def withPm2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pm2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPm2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pm2")(js.undefined)
        ret
    }
    @scala.inline
    def withPostfix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postfix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostfix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postfix")(js.undefined)
        ret
    }
    @scala.inline
    def withPostgresql(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postgresql")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostgresql: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postgresql")(js.undefined)
        ret
    }
    @scala.inline
    def withPython(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("python")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPython: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("python")(js.undefined)
        ret
    }
    @scala.inline
    def withPython3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("python3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPython3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("python3")(js.undefined)
        ret
    }
    @scala.inline
    def withRedis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redis")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemOpenssl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemOpenssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemOpenssl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemOpenssl")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemOpensslLib(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemOpensslLib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemOpensslLib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemOpensslLib")(js.undefined)
        ret
    }
    @scala.inline
    def withTsc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tsc")(js.undefined)
        ret
    }
    @scala.inline
    def withV8(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v8")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutV8: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v8")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualbox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualbox")(js.undefined)
        ret
    }
    @scala.inline
    def withYarn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yarn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYarn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yarn")(js.undefined)
        ret
    }
  }
  
}

