package typingsSlinky.tldjs.anon

import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hostname extends js.Object {
  var domain: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof getDomain */ js.Any
  ] = js.native
  var hostname: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof extractHostname */ js.Any
  ] = js.native
  var isIp: Boolean = js.native
  var isValid: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof isValid */ js.Any
  ] = js.native
  var publicSuffix: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof getPublicSuffix */ js.Any
  ] = js.native
  var subdomain: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof getSubdomain */ js.Any
  ] = js.native
  var tldExists: ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof tldExists */ js.Any
  ] = js.native
}

object Hostname {
  @scala.inline
  def apply(
    domain: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getDomain */ js.Any
    ],
    hostname: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof extractHostname */ js.Any
    ],
    isIp: Boolean,
    isValid: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof isValid */ js.Any
    ],
    publicSuffix: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getPublicSuffix */ js.Any
    ],
    subdomain: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getSubdomain */ js.Any
    ],
    tldExists: ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof tldExists */ js.Any
    ]
  ): Hostname = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], isIp = isIp.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], publicSuffix = publicSuffix.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any], tldExists = tldExists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hostname]
  }
  @scala.inline
  implicit class HostnameOps[Self <: Hostname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getDomain */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostname(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof extractHostname */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsValid(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof isValid */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicSuffix(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getPublicSuffix */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubdomain(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof getSubdomain */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTldExists(
      value: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof tldExists */ js.Any
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tldExists")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

