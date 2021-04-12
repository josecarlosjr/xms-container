// Pipelines must run on master node 10.0.165.12 because of custom storage


// #####################################################

// Variables derived from VERSION environment variable

// #####################################################


//VERSION = params.VERSION


def buildXcipioXms() {


    def xcipioBuild = build(

            job: "pipeline-official-build-xcipio-xms-container", propagate: true,

            parameters: [

                    //[$class: 'NodeParameterValue', name: 'BUILD_NODE', labels: [params.BUILD_NODE], nodeEligibility: [$class: 'AllNodeEligibility']],

                    string(name: 'WINAP_VERSION', value: "Versão 8.0.8"),

                    //string(name: 'XCP_BUILD_NUMBER', value: XCP_BUILD_NUMBER),

                    //string(name: 'VERSION', value: VERSION)

            ]

    )

    }


return this



































