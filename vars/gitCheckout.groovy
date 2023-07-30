def call(Map stageParams) {
 
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.main ]],
        userRemoteConfigs: [[ url: stageParams.https://github.com/paul-njuabeh/CI-CD-Project.git ]]
    ])
  }
